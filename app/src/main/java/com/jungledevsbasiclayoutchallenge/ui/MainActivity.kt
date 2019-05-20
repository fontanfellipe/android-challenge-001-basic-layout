package com.jungledevsbasiclayoutchallenge.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jungledevsbasiclayoutchallenge.DataBinderMapperImpl
import com.jungledevsbasiclayoutchallenge.R
import com.jungledevsbasiclayoutchallenge.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // todo: remove thiss

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}
