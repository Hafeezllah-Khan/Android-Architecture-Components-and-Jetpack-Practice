package com.example.androidarchitecturecomponentsandjetpackpractice.viewmodel

import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    var count = 0

    fun increaseCount() {
        count++
    }
}