package com.lll.commonkotlin.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Base Activty 不能提供给 其他Activity 继承
 */
class Base1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}
