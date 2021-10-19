package com.example.agendabelupet.utils

import android.app.Activity
import android.app.AlertDialog
import com.example.agendabelupet.R
import kotlinx.android.synthetic.main.fragment_custom_dialog.view.*
import kotlinx.android.synthetic.main.fragment_two_options.view.*

class CustomDialogsExt(val activity: Activity) {
    private var dialog : AlertDialog? = null

    fun defaultDialog(
        title: Int,
//        mensage: Int,
        image: Int,
        isCancelable: Boolean = true,
        onPositive: () -> Unit
    ){
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(R.layout.fragment_custom_dialog, null)
        val builder = AlertDialog.Builder(activity)
        builder.setView(dialogView)
        dialogView.text_warning.setText(title)
        dialogView.image_dialog.setImageResource(image)
        dialogView.button_ok.setOnClickListener{ onPositive() }
        builder.setCancelable(isCancelable)
        dialog = builder.create()
        dialog!!.show()
    }

    fun startProgressBar(){
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(R.layout.progress_bar_fragment, null)
        val builder = AlertDialog.Builder(activity)
        builder.setCancelable(false)
        builder.setView(dialogView)
        dialog = builder.create()
        dialog!!.show()
    }

    fun dismissCustomFragment(){
        if(dialog == null){
            return
        }else {
            dialog!!.dismiss()
        }
    }

    fun defaultDialogTwoOptions(
        title : Int,
        image: Int,
        isCancelable: Boolean = true ,
        onPositive: () -> Unit,
        onNegative: () -> Unit
    ){
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(R.layout.fragment_two_options, null)
        val builder = AlertDialog.Builder(activity)
        builder.setView(dialogView)
        dialogView.text_warning_two_options.setText(title)
        dialogView.image_dialog_two_options.setImageResource(image)
        dialogView.button_sim.setOnClickListener{ onPositive() }
        dialogView.button_nao.setOnClickListener{ onNegative() }
        builder.setCancelable(isCancelable)
        dialog = builder.create()
        dialog!!.show()
    }

}