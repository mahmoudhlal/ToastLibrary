package com.mahmoudhlal.toastlibrary

import android.content.Context
import android.widget.Toast

object MToast {
    fun longToast(context:Context , txt:String){
        Toast.makeText(context , txt , Toast.LENGTH_LONG).show()
    }
    fun shortToast(context:Context , txt:String){
        Toast.makeText(context , txt , Toast.LENGTH_SHORT).show()
    }
}