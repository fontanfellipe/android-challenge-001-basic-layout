package com.jungledevsbasiclayoutchallenge.repository

import com.jungledevsbasiclayoutchallenge.model.Forecast
import com.jungledevsbasiclayoutchallenge.model.WeatherType
import java.util.*

class ForecastRepository {

    private val mockData = listOf(
        Forecast(WeatherType.LightWeather, "Sunny"),
        Forecast(WeatherType.LightWeather, "Partly cloudy"),
        Forecast(WeatherType.LightWeather, "Mostly cloudy"),
        Forecast(WeatherType.MediumWeather, "Cloudy"),
        Forecast(WeatherType.MediumWeather, "Showers"),
        Forecast(WeatherType.MediumWeather, "Rain"),
        Forecast(WeatherType.HeavyWeather, "Thunderstorm")
    )

    fun getForecast(): Forecast {
        val randomWeather = Random().nextInt(7)
        return mockData[randomWeather]
    }

}