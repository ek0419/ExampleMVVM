package com.example.examplemvvm.data

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.data.network.QuoteService
import javax.inject.Inject

/**
Created by Omy on 23,agosto,2021
 */
class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val QuoteProvider :QuoteProvider
){
    suspend fun getAllQuotes() : List<QuoteModel>{
        val response =  api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }

}