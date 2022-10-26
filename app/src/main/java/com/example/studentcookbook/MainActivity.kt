package com.example.studentcookbook

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.studentcookbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        getSupportActionBar()?.hide() // this hides the actionbar
        @Suppress("UNUSED_VARIABLE")
        val binding :ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setupActionBarWithNavController(findNavController(R.id.myNavHostFragment))

    }
}