package com.example.myapplication.Api

import com.example.myapplication.Personajes
import retrofit2.Call
import retrofit2.http.GET

interface ApiPersonajes {

    @GET("characters")
    fun getTraer(): Call<List<Personajes>>
}