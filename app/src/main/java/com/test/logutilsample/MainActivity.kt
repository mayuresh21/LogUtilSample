package com.test.logutilsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.logutil.LogUtil
import com.test.util.Utility
import com.test.utility.DateHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtil.logD("Hi Mayuresh Deshmukh ")
        LogUtil.logD(""+DateHelper.currentDateAsStringddMMMyyyy)
        Utility.Util.printOwnerName()
    }
}