package com.example.weatherforecast.di

import com.example.weatherforecast.data.datasource.WeatherDataSource
import com.example.weatherforecast.data.repo.WeatherRepository
import com.example.weatherforecast.retrofit.WeatherDao
import com.example.weatherforecast.util.Consts.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWeatherRepository(wds: WeatherDataSource): WeatherRepository{
        return WeatherRepository(wds)
    }

    @Provides
    @Singleton
    fun provideWeatherDataSource(wdao: WeatherDao): WeatherDataSource{
        return WeatherDataSource(wdao)
    }

    @Singleton
    @Provides
    fun injectRetrofitAPI() : WeatherDao {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build().create(WeatherDao::class.java)
    }


}