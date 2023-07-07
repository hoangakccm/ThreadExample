package com.example.threadexample

import android.util.Log

class CountThread(private val name1: String): Thread() {
    companion object{
        private const val LOG =" CountThread"
    }

    override fun run() {
        for (i in 1..10){
            Log.d(LOG, "$name1 - $i")
            sleep(1000)
        }

    }
}