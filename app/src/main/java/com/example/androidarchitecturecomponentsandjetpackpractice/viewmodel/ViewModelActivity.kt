package com.example.androidarchitecturecomponentsandjetpackpractice.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecturecomponentsandjetpackpractice.R
import com.example.androidarchitecturecomponentsandjetpackpractice.databinding.ActivityViewModelBinding

class ViewModelActivity : AppCompatActivity() {
    /**
     * Called when the activity is first created.
     */

    lateinit var binding: ActivityViewModelBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(ViewModel::class.java)

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