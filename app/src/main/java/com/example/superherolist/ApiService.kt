package com.example.superherolist

import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("14c30595f4d42f72745685bda37e53e1/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): retrofit2.Response<SuperHeroDataResponse>

}