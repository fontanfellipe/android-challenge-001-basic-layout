package com.jungledevsbasiclayoutchallenge.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jungledevsbasiclayoutchallenge.R
import com.jungledevsbasiclayoutchallenge.databinding.ActivityMainBinding
import com.jungledevsbasiclayoutchallenge.model.WeatherType
import com.jungledevsbasiclayoutchallenge.viewmodel.ForecastViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ForecastViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(ForecastViewModel::class.java)

        setupBindings(binding)
        setupViews()
        registerObservers()
    }

    private fun setupViews() {

    }

    private fun registerObservers() {
        
    }

    private fun setupBindings(binding: ActivityMainBinding?) {
        binding?.apply {
            lifecycleOwner = this@MainActivity
            forecastViewModel = viewModel
            forecast = viewModel.forecast.value
            executePendingBindings()
        }
    }

}
