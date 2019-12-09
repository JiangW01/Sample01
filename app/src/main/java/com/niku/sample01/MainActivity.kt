package com.niku.sample01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnViewBackground.setOnClickListener {
            startActivity(Intent(this,ViewShapeActivity::class.java))
        }
        btnViewState.setOnClickListener {
            startActivity(Intent(this,StateListDrawableActivity::class.java))
        }


    }
}
