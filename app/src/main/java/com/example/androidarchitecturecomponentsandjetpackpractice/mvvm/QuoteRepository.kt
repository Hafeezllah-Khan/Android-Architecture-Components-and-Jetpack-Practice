package com.example.androidarchitecturecomponentsandjetpackpractice.mvvm

import javax.inject.Inject
import javax.inject.Singleton


class QuoteRepository @Inject constructor(private val quoteDao: QuoteDao) {

    fun getQuotes() = quoteDao.getQuotes()

    suspend fun insertQuote(quote: Quote) {
        quoteDao.insertQuote(quote)
    }
}