package com.example.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
Created by Omy on 20,agosto,2021
 */
object RetrofitHelper {
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}