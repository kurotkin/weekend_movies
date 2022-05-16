package com.kurotkin.weekendmovies.date.models


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("average")
    val average: Double
)