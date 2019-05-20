package com.jungledevsbasiclayoutchallenge.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jungledevsbasiclayoutchallenge.model.Forecast
import com.jungledevsbasiclayoutchallenge.model.WeatherType
import com.jungledevsbasiclayoutchallenge.repository.ForecastRepository

class ForecastViewModel : ViewModel() {

    private val repository: ForecastRepository by lazy { ForecastRepository() }

    val forecast: MutableLiveData<Forecast> = MutableLiveData()

    init {
        loadForecast()
    }

    fun loadForecast() {
        forecast.postValue(repository.getForecast())
        forecast.value?.temperature
    }

}