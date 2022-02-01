package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import javax.inject.Inject

/**
Created by Omy on 24,agosto,2021
 */
class GetRandomQuotesUseCase @Inject constructor(private val quoteProvider : QuoteProvider) {

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        val randomNumber = (quotes.indices).random()
        if (!quotes.isNullOrEmpty())
            return quotes[randomNumber]
        return null
    }
}