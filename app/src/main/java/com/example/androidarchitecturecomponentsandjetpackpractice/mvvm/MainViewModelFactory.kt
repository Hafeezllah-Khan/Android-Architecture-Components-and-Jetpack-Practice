package com.example.androidarchitecturecomponentsandjetpackpractice.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(private val qouteRepository: QuoteRepository):  ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(qouteRepository) as T
    }
}