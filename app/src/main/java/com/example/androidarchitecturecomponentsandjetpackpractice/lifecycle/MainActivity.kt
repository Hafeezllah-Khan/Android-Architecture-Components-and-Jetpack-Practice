package com.example.androidarchitecturecomponentsandjetpackpractice.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidarchitecturecomponentsandjetpackpractice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lifeCycleObserver = Observer(lifecycle, MyLogger())
        lifecycle.addObserver(lifeCycleObserver)
    }
}