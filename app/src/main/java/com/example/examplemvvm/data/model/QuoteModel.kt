package com.example.examplemvvm.data.model

import com.google.gson.annotations.SerializedName

/**
Created by Omy on 18,agosto,2021
 */
data class QuoteModel(
    @SerializedName("quote")
    val quote: String,
    @SerializedName("author")
    val author :String
)