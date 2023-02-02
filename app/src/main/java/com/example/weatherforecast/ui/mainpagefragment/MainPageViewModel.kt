package com.example.weatherforecast.ui.mainpagefragment

import androidx.lifecycle.ViewModel
import com.example.weatherforecast.data.repo.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainPageViewModel @Inject constructor(var wrepo: WeatherRepository): ViewModel(){


}