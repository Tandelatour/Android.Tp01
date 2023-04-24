package com.example.demoeni.tptwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demoeni.R
import com.example.demoeni.databinding.ActivityTwitterBinding

class TwitterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityTwitterBinding>(this, R.layout.activity_twitter)

    }
}