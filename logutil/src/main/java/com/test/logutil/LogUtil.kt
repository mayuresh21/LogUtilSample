package com.test.logutil

import android.util.Log

object LogUtil {
    fun logD(str:String){
        Log.d("Mayuresh=> ",""+str)
    }

    fun logE(str:String){
        Log.e("Error=> ",""+str)
    }

    fun logI(str:String){
        Log.i("Info=>  ",""+str)
    }
}