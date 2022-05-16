package com.kurotkin.weekendmovies.date.models


import com.google.gson.annotations.SerializedName

data class Network(
    @SerializedName("country")
    val country: Country,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("officialSite")
    val officialSite: String
)