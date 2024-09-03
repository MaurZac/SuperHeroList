package com.example.superherolist

import com.google.gson.annotations.SerializedName

data class SuperHeroDataResponse(
    val response: String,
    @SerializedName("results") val superheros: List<SuperHeroItemResponse>
)

data class SuperHeroItemResponse(
    @SerializedName("id") val  superheroId: String,
    @SerializedName("name") val name: String
)