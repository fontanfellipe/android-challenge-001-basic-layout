package com.jungledevsbasiclayoutchallenge.model

data class Forecast(
    val type: WeatherType,
    val forecast: String,
    val temperature: Int = 22,
    val maxTemperature: Int = 24,
    val minTemperature: Int = 18,
    val humidity: Int = 50,
    val windSpeed: Int = 2,
    val rainDrops: Int = 20
)

enum class WeatherType {
    LightWeather, MediumWeather, HeavyWeather
}