package com.example.examplemvvm.data.network

import android.util.Log
import com.example.examplemvvm.core.RetrofitHelper

import com.example.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
Created by Omy on 20,agosto,2021
 */
class QuoteService @Inject constructor(private val api:QuoteApiCliente){

   // private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            Log.d("OMY","CALL SERVICE")
       // val response = retrofit.create(QuoteApiCliente::class.java).getAllQuotes()
            val response = api.getAllQuotes() //inyectado por dependencia
         response.body()?: emptyList()
        }
    }
}