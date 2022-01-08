package com.beok.beoklibrary

import android.os.Bundle
import beok.library.base.BaseActivity
import com.beok.beoklibrary.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private val binding by binding<ActivityMainBinding>(
        layoutResourceID = R.layout.activity_main
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding
    }
}