package com.example.androidarchitecturecomponentsandjetpackpractice.viewModelFactory

import androidx.lifecycle.ViewModel

class ViewModelF(initialValue: Int) : ViewModel() {
    var count = initialValue

    fun increaseCount() {
        count++
    }
}