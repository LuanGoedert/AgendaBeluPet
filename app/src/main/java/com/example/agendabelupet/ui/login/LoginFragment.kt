package com.example.agendabelupet.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.agendabelupet.R
import com.example.agendabelupet.databinding.LoginFragmentBinding
import com.example.agendabelupet.utils.CustomDialogsExt
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_fragment.*
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var auth: FirebaseAuth

    private lateinit var binding: LoginFragmentBinding

    private lateinit var customDialogsExt: CustomDialogsExt


    private val viewModel: LoginViewModel by viewModel()


    companion object {
        private const val TAG = "GoogleActivity"
        private const val RC_SIGN_IN = 9001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(requireActivity(), gso)

        auth = Firebase.auth
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        requireActivity().toolbar_main.isVisible = false
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        customDialogsExt = CustomDialogsExt(requireActivity())
        viewModel.initLoading()
        viewModel.getLocalUser(requireContext(), requireActivity())



        viewModel.mCurrentuser.observe(viewLifecycleOwner) {
            it?.let {
                viewModel.updateUI(it, requireContext(), requireActivity()).invokeOnCompletion {
                    navigateToAgendaFragment()
                }
            }
        }

        viewModel.loginError.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    customDialogsExt.defaultDialog(
                        title = R.string.text_error,
                        image = R.drawable.icone_erro,
                        isCancelable = true
                    ) {
                        viewModel.mLoginError.postValue(false)
                        customDialogsExt.dismissCustomFragment()
                    }
                }
            }
        }

        viewModel.loadingScreen.observe(viewLifecycleOwner) {
            if (it) {
                customDialogsExt.startProgressBar()
            } else {
                customDialogsExt.dismissCustomFragment()
            }
        }

        signInButton.setOnClickListener {
            signIn()
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)!!
                viewModel.mloadingScreen.postValue(true)
                Log.d(
                    TAG, "firebaseAuthWithGoogle:" + account.displayName
                )
                viewModel.firebaseAuthWithGoogle(account.idToken!!,requireActivity(),auth,requireContext()).invokeOnCompletion {
                        viewModel.mloadingScreen.postValue(false)
                        navigateToAgendaFragment()
                    }
            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.w(TAG, "Google sign in failed", e)
            }
        }
    }

    private fun signIn() {
        val signInIntent = googleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    private fun navigateToAgendaFragment() {
        viewModel.stopLoading()
        val action = LoginFragmentDirections.actionLoginFragmentToFragmentAgenda()
        findNavController().navigate(action)
    }

}