package com.appsid.meshcare.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClientInstance(): Retrofit{
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://34.72.107.124/docs")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}