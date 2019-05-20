package com.jungledevsbasiclayoutchallenge.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jungledevsbasiclayoutchallenge.model.Forecast
import com.jungledevsbasiclayoutchallenge.repository.ForecastRepository

class ForecastViewModel : ViewModel() {

    private val repository: ForecastRepository by lazy { ForecastRepository() }

    var currentWeather: MutableLiveData<Forecast> = MutableLiveData()

    fun loadForecast() {
        currentWeather.postValue(repository.getForecast())
    }

}