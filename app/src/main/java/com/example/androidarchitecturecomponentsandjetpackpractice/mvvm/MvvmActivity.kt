package com.example.androidarchitecturecomponentsandjetpackpractice.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecturecomponentsandjetpackpractice.R
import com.example.androidarchitecturecomponentsandjetpackpractice.databinding.ActivityMvvmBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MvvmActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mvvm)

        /*val dao = QuoteDatabase.getDatabase(applicationContext)?.quoteDao()
        val repository = QuoteRepository(dao!!)

        viewModel = ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)*/

        viewModel.getQuotes().observe(this, Observer {
            quotes -> binding.quotes = quotes.toString()
        })

        binding.btnAddQuote.setOnClickListener {
            val quote = Quote(0 , "This is a quote",  "Author")
            viewModel.insertQuote(quote)
        }
    }
}