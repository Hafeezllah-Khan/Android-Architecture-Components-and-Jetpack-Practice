package com.example.androidarchitecturecomponentsandjetpackpractice.viewModelFactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecturecomponentsandjetpackpractice.R
import com.example.androidarchitecturecomponentsandjetpackpractice.databinding.ActivityFactoryBinding
import com.example.androidarchitecturecomponentsandjetpackpractice.viewmodel.ViewModel

class FactoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityFactoryBinding
    lateinit var viewModel: ViewModelF

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFactoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, ViewModelFactory(10)).get(ViewModelF::class.java)

        setTextView()

        binding.button.setOnClickListener {
            viewModel.increaseCount()
            setTextView()
        }
    }


    private fun setTextView() {
        binding.countTxt.text = viewModel.count.toString()
    }
}