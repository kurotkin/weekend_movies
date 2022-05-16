package com.kurotkin.weekendmovies.date.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val api: ApiService){

    suspend fun getAllMovies() = api.getAllMovies()
}