package com.example.androidarchitecturecomponentsandjetpackpractice.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(val initialValue:  Int):  ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModelF(initialValue) as T
    }
}