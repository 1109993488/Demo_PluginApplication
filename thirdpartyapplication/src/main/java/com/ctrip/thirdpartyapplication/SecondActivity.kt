package com.ctrip.thirdpartyapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

/**
 * Created by BlingBling on 2019-10-22.
 */
class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var img = findViewById<ImageView>(R.id.img)
        img.setOnClickListener {
            Toast.makeText(that, "点击啦", Toast.LENGTH_SHORT).show()
        }
    }
}