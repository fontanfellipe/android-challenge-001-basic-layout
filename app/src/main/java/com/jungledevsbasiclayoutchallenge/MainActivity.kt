package com.jungledevsbasiclayoutchallenge

import android.os.Bundle

class MainActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_Launcher)
        setContentView(R.layout.activity_main)

    }
}
