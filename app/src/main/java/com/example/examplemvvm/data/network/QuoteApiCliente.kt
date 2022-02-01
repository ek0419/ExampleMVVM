package com.example.examplemvvm.data.network

import com.example.examplemvvm.data.model.QuoteModel
import retrofit2.Response

import retrofit2.http.GET

/**
Created by Omy on 20,agosto,2021
 */
interface QuoteApiCliente {

    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}