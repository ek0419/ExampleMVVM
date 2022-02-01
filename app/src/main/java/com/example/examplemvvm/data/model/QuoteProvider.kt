package com.example.examplemvvm.data.model

import javax.inject.Inject
import javax.inject.Singleton

/**
Created by Omy on 18,agosto,2021
 */
@Singleton
class QuoteProvider @Inject constructor(){
   // companion object{
        var quotes: List<QuoteModel> = emptyList()
 //   }

}