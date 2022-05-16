package com.kurotkin.weekendmovies.date.models


import com.google.gson.annotations.SerializedName

data class Externals(
    @SerializedName("imdb")
    val imdb: String,
    @SerializedName("thetvdb")
    val thetvdb: Int,
    @SerializedName("tvrage")
    val tvrage: Int
)