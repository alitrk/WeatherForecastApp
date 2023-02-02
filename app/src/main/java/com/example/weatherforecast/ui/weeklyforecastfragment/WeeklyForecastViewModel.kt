package com.example.weatherforecast.ui.weeklyforecastfragment

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repo.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeeklyForecastViewModel @Inject constructor(var wrepo: WeatherRepository): ViewModel(){


}