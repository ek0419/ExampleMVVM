package com.example.examplemvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.domain.GetQuotesInternetUseCase
import com.example.examplemvvm.domain.GetRandomQuotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
Created by Omy on 19,agosto,2021
 */
@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuotesInternetIterator : GetQuotesInternetUseCase,
    private val getRandomQuotesIterator : GetRandomQuotesUseCase
)  :ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    val isload =  MutableLiveData<Boolean>()

    fun onCreate(){
       viewModelScope.launch {
           isload.postValue(true)
           val result = getQuotesInternetIterator()
           if(!result.isNullOrEmpty() ){
               quoteModel.postValue(result[0])
               isload.postValue(false)
           }
       }
    }
    fun randomQuote(){
        isload.postValue(true)
        val quote = getRandomQuotesIterator()
        if(quote != null)
            quoteModel.postValue(quote!!)

        isload.postValue(false)
    }
}



