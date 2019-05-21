package com.jungledevsbasiclayoutchallenge.repository

import com.jungledevsbasiclayoutchallenge.model.Forecast
import com.jungledevsbasiclayoutchallenge.model.WeatherType
import java.util.*

class ForecastRepository {

    private val mockData = listOf(
        Forecast(WeatherType.SUNNY),
        Forecast(WeatherType.PARTLY_CLOUDY),
        Forecast(WeatherType.MOSTLY_CLOUDY),
        Forecast(WeatherType.CLOUDY),
        Forecast(WeatherType.SHOWERS),
        Forecast(WeatherType.RAIN),
        Forecast(WeatherType.THUNDERSTORM)
    )

    fun getForecast(): Forecast {
        val randomWeather = Random().nextInt(7)
        return mockData[randomWeather]
    }

}