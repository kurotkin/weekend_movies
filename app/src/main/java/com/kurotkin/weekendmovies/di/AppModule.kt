package com.kurotkin.weekendmovies.di

import com.kurotkin.weekendmovies.date.network.ApiService
import com.kurotkin.weekendmovies.utils.Constants
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
    fun provideretrofit() : ApiService =
        Retrofit.Builder()
            .baseUrl(Constants.Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

}