package com.jungledevsbasiclayoutchallenge.ui

import android.graphics.drawable.Drawable
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
        registerObservers()
    }

    private fun registerObservers() {
        viewModel.forecast.observe(this, Observer { forecast ->

            weather_background.background = when(forecast.type) {
                WeatherType.SUNNY, WeatherType.PARTLY_CLOUDY, WeatherType.MOSTLY_CLOUDY -> { getDrawable(R.drawable.light_background_gradient) }
                WeatherType.CLOUDY, WeatherType.SHOWERS, WeatherType.RAIN -> { getDrawable(R.drawable.medium_background_gradient) }
                WeatherType.THUNDERSTORM -> { getDrawable(R.drawable.dark_background_gradient) }
            }
            forecast_icon.setImageDrawable(getDrawable(forecast.type.drawableId))
            forecast_text.text = forecast.type.displayName
            forecast_temperature.text = forecast.renderTemperature()
            minimum_temperature.text = forecast.renderMinTemperature()
            maximum_temperature.text = forecast.renderMaxTemperature()
            wind_text.text = getString(R.string.kilometers_per_hour_abbreviated, forecast.windSpeed)
            humidity_text.text = getString(R.string.percentage, forecast.humidity)
            raindrops_text.text = getString(R.string.millimeters, forecast.rainDrops)

        })
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
