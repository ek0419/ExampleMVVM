package com.example.examplemvvm.di

import com.example.examplemvvm.data.network.QuoteApiCliente
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
Created by Omy on 15,septiembre,2021
 */
@Module
@InstallIn(SingletonComponent::class) //instania de aplicacion que se puede llamar en todas partes
            //NOTA @SINGLETON ES LA ANOTACIÓN, NO CREA SINGLETON
object NetworkModule {

    @Singleton // que utilise singleton para que nos regrese siempre la misma instancia
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit : Retrofit):QuoteApiCliente{
        return retrofit.create(QuoteApiCliente::class.java)
    }

}