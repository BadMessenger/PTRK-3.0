package com.example.ptrk12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.component2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(R.string.hello)
        println(getString(R.string.hello))
    }
}