package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel
import javax.inject.Inject

/**
Created by Omy on 23,agosto,2021
 */
class GetQuotesInternetUseCase @Inject constructor(
    private val repository: QuoteRepository
) {


    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()


}