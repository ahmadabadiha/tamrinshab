package com.example.tamrinshab.data

import retrofit2.Response
import javax.inject.Inject

class RemoteDataDource @Inject constructor(private val retrofitMethods: RetrofitMethods) {

    suspend fun getPhotoList(): Response<List<PhotoItem>>{
        return retrofitMethods.getPhotoList()
    }
}