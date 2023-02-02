package com.example.weatherforecast.data.model
import com.google.gson.annotations.SerializedName

data class Weather(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)

data class Current(
    val airQuality: AirQuality,
    val condition: Condition,
    @SerializedName ("feelslike_c")
    val feelsLikeC: Double,

    @SerializedName ("feelslike_f")
    val feelsLikeF: Double,

    val humidity: Int,
    @SerializedName ("is_day")
    val isDay: Int,

    @SerializedName ("last_updated")
    val lastUpdated: String,

    @SerializedName ("last_updated_epoch")
    val lastUpdatedEpoch: Int,

    @SerializedName ("temp_c")
    val tempC: Double,

    @SerializedName ("temp_f")
    val tempF: Double,

    @SerializedName ("wind_dir")
    val windDir: String,

    @SerializedName ("wind_kph")
    val windKph: Double,

    @SerializedName ("wind_mph")
    val windMph: Double
)

data class Forecast(
    val forecastDay: List<Forecastday>
)

data class Location(
    val country: String,
    val lat: Double,

    @SerializedName ("localtime")
    val localTime: String,

    @SerializedName ("localtime_epoch")
    val localTimeEpoch: Int,

    val lon: Double,
    val name: String,
    val region: String,

    @SerializedName ("tz_id")
    val timeZoneId: String
)

data class AirQuality(
    @SerializedName ("gb-defra-index")
    val gbDefraIndex: Int,

    @SerializedName ("us-epa-index")
    val usEpaIndex: Int,

)

data class Condition(
    val code: Int,
    val icon: String,
    val text: String
)

data class Forecastday(
    val astro: Astro,
    val date: String,
    @SerializedName ("date_epoch")
    val dateEpoch: Int,

    val day: Day,
    val hour: List<Hour>
)

data class Astro(
    @SerializedName ("moon_phase")
    val moonPhase: String,

    val sunrise: String,
    val sunset: String
)

data class Day(
    val airQuality: AirQuality,
    @SerializedName ("avgtemp_c")
    val avgTempC: Double,

    @SerializedName ("avgtemp_f")
    val avgTempF: Double,

    val condition: Condition,
    @SerializedName ("daily_chance_of_rain")
    val dailyChanceOfRain: Int,

    @SerializedName ("daily_chance_of_snow")
    val dailyChanceOfSnow: Int,

    @SerializedName ("maxtemp_c")
    val maxTempC: Double,

    @SerializedName ("maxtemp_f")
    val maxTempF: Double,

    @SerializedName ("mintemp_c")
    val minTempC: Double,

    @SerializedName ("mintemp_f")
    val minTempF: Double,

    val uv: Double
)

data class Hour(

    val condition: Condition,

    @SerializedName ("temp_c")
    val tempCHour: Double,

    @SerializedName ("temp_f")
    val tempFHour: Double,

    val time: String,
    @SerializedName ("time_epoch")
    val timeEpoch: Int,

)