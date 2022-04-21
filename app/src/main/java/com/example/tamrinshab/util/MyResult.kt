package com.example.tamrinshab.util

sealed class MyResult<T>{
    data class Success<T>(val data: T)
    data class Fail<T>(val message: String)
    data class Loading(val message: String = "Data is Loading")
}