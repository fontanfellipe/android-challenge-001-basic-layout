package com.jungledevsbasiclayoutchallenge

import android.content.Intent
import android.os.Bundle
import android.os.Handler

class MainActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(Intent(this, WeatherActivity::class.java))
        }, 2000L)
    }
}
