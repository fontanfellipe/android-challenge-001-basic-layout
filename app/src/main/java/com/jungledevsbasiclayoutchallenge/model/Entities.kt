package com.jungledevsbasiclayoutchallenge.model

import com.jungledevsbasiclayoutchallenge.R

data class Forecast(
    val type: WeatherType,
    val temperature: Int = 22,
    val maxTemperature: Int = 24,
    val minTemperature: Int = 18,
    val humidity: Int = 50,
    val windSpeed: Int = 2,
    val rainDrops: Int = 20
) {
    fun renderTemperature() = "$temperature"
    fun renderMaxTemperature() = "$maxTemperature"
    fun renderMinTemperature() = "$minTemperature"
    fun renderHumidity() = "$humidity ${R.string.percentage}"
    fun renderWindSpeed() = "$windSpeed ${R.string.kilometers_per_hour_abbreviated}"
    fun renderRainDrops() = "$rainDrops ${R.string.millimeters}"
}

enum class WeatherType(val displayName: String, val drawableId: Int) {
    SUNNY("Sunny", R.drawable.image_sunny),
    PARTLY_CLOUDY("Partly cloudy", R.drawable.image_partlycloudy),
    MOSTLY_CLOUDY("Mostly cloudy", R.drawable.image_mostlycloudy),
    CLOUDY("Cloudy", R.drawable.image_cloudy),
    SHOWERS("Showers", R.drawable.image_showers),
    RAIN("Rain", R.drawable.image_rain),
    THUNDERSTORM("Thunderstorm", R.drawable.image_thunderstorm)
}