package com.kurotkin.weekendmovies.date.network

import com.kurotkin.weekendmovies.date.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}