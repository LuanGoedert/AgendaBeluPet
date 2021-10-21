package com.example.agendabelupet.ui.login

import android.app.Activity
import android.app.Application
import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.lifecycle.*
import com.bumptech.glide.Glide
import com.example.agendabelupet.models.entities.UserEntity
import com.example.agendabelupet.repository.UserRepositoryImpl
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.coroutines.launch

class LoginViewModel(application: Application, private val userRepositoryImpl: UserRepositoryImpl) :
    AndroidViewModel(application) {

    val mCurrentuser = MutableLiveData<UserEntity>()

    val mloadingScreen = MutableLiveData<Boolean>(false)
    val loadingScreen: LiveData<Boolean>
        get() {
            return mloadingScreen
        }

    val mLoginError = MutableLiveData<Boolean>()
    val loginError: LiveData<Boolean>
        get() {
            return mLoginError
        }

    init {
        viewModelScope.launch {
//            getLocalUser()
        }
    }

    suspend fun getLocalUser(context: Context, activity: Activity) = viewModelScope.launch {
        mCurrentuser.value = userRepositoryImpl.getUser()
        updateUI(mCurrentuser.value!!, context, activity)
    }

    private fun insertUser(user: FirebaseUser) = viewModelScope.launch {
        val userEntity = UserEntity(
            userName = user.displayName.toString(),
            userEmail = user.email.toString(),
            userPhotoUri = user.photoUrl.toString()
        )
        userRepositoryImpl.insertUser(userEntity)
    }

    fun updateUI(user: UserEntity, context: Context, activity: Activity) = viewModelScope.launch {
        try {
            val imageUri: Uri = Uri.parse(user.userPhotoUri)
            Glide.with(context).load(imageUri).into(activity.userImage)
            activity.text_welcome.text = "Olá ${user.userName}"
        } catch (ex: Exception) {
            Log.v("update", ex.message.toString())
        }
    }

    fun firebaseAuthWithGoogle(
        idToken: String,
        activity: Activity,
        auth: FirebaseAuth,
        context: Context
    ) =
        viewModelScope.launch {
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            auth.signInWithCredential(credential)
                .addOnCompleteListener(activity) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        insertUser(auth.currentUser!!).invokeOnCompletion {
                            viewModelScope.launch { getLocalUser(context, activity) }
                        }
                    } else {
                        // If sign in fails, display a message to the user.
                        mLoginError.postValue(true)
                    }
                }
        }
}