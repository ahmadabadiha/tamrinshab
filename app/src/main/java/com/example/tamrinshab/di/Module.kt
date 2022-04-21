package com.example.tamrinshab.di

import com.example.tamrinshab.data.RetrofitMethods
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object Module {

    @Singleton
    @Provides
    fun provideBaseUrl(): String = "https://picsum.photos/"

    @Singleton
    @Provides
    fun provideGsonConverterFactory() = GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideRetrofit(baseUrl: String, gsonConverterFactory: GsonConverterFactory): Retrofit =
        Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(gsonConverterFactory).build()

    @Singleton
    @Provides
    fun provideRetrofitService(retrofit: Retrofit): RetrofitMethods = retrofit.create(RetrofitMethods::class.java)

}