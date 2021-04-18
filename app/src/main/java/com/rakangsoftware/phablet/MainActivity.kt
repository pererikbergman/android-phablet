package com.rakangsoftware.phablet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rakangsoftware.phablet.utils.setupOrientation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setupOrientation()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout_with_bar)
    }
}


