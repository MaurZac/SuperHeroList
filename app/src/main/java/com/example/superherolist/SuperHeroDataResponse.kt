package com.example.superherolist

import com.google.gson.annotations.SerializedName
import retrofit2.http.Url

data class SuperHeroDataResponse(
    val response: String,
    @SerializedName("results") val superheros: List<SuperHeroItemResponse>
)

data class SuperHeroItemResponse(
    @SerializedName("id") val  superheroId: String,
    @SerializedName("name") val name: String,
    @SerializedName("image") val superheroImage: SuperHeroImageResponse
)

data class SuperHeroImageResponse(
    @SerializedName("url") val url: String
)