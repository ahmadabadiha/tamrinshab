package com.example.tamrinshab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = CoroutineScope(Dispatchers.Main).async {
            myFun()
        }
        lifecycleScope.launch {
            x.await()
            Log.d("ahmadabadiha", "onCreate: " + x.await())
        }

        val job1: Job = lifecycleScope.launch {

        }

        job1.invokeOnCompletion {

        }


        /*    val job1 = CoroutineScope(Dispatchers.Main).launch {

                Log.d("ahmadabadiha", "onCreate: long delay")
            }
            val job2 = CoroutineScope(Dispatchers.Default).launch {
                repeat(5) {
                    Log.d("ahmadabadiha", "repeated ")

                }
            }
            lifecycleScope.launch {
                Log.d("ahmadabadiha", "onCreate: " + job2.isCompleted.toString())
                job2.cancelAndJoin()
                Log.d("ahmadabadiha", "residim: ")
                Log.d("ahmadabadiha", "onCreate: " + job2.isCompleted.toString())

            }*/
        //   Log.d("ahmadabadiha", "residim2: ")


        /*  CoroutineScope(Dispatchers.Main).launch {
              Log.d("ahmadabadiha", "onCreate: " + Thread.currentThread().name)
          }
          CoroutineScope(Dispatchers.Main).launch {
              Log.d("ahmadabadiha", "onCreate: " + Thread.currentThread().name)
          }*/
    }

    suspend fun myFun(): String {
        delay(3000)
        return "returned"
    }
}
/*

fun main()= runBlocking {

    CoroutineScope(Dispatchers.Main).launch {
        println("ahmadabadiha"+ "onCreate: " + Thread.currentThread().name)
    }
    CoroutineScope(Dispatchers.Main).launch {
        repeat(5){
            println("ahmadabadiha"+"repeated " + Thread.currentThread().name)
            delay(1500)
        }
    }
*/
/*    CoroutineScope(Dispatchers.Main).launch {
        println("ali", "onCreate: " + Thread.currentThread().name)
    }
    CoroutineScope(Dispatchers.Main).launch {
        Log.d("ali", "onCreate: " + Thread.currentThread().name)
    }*//*


}*/
