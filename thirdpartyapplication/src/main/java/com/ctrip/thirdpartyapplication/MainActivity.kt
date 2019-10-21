package com.ctrip.thirdpartyapplication

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jump.setOnClickListener {
            startActivity(Intent(that, SecondActivity::class.java))
        }
    }
}
