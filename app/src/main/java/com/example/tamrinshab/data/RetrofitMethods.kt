package com.example.tamrinshab.data

import retrofit2.Response
import retrofit2.http.GET

interface RetrofitMethods {

    @GET("v2/list")
    suspend fun getPhotoList(): Response<List<PhotoItem>>

}