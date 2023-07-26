package com.example.myapplication.Retrofit

import com.example.myapplication.Api.ApiPersonajes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitPersonajes {

    private val retrofit = Retrofit.Builder()

        .baseUrl("https://last-airbender-api.fly.dev/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val consumirApi = retrofit.create(ApiPersonajes::class.java)
}