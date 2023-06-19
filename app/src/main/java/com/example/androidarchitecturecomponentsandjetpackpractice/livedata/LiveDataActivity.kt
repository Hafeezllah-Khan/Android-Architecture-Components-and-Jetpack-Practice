package com.example.androidarchitecturecomponentsandjetpackpractice.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DiffUtil
import com.example.androidarchitecturecomponentsandjetpackpractice.R
import com.example.androidarchitecturecomponentsandjetpackpractice.databinding.ActivityLiveDataBinding

class LiveDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityLiveDataBinding
    lateinit var viewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data)
//        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner  = this

        /*viewModel.liveData.observe(this) {
            binding.textView.text = it
        }

        binding.updateBtn.setOnClickListener {
            viewModel.updateData()
        }*/
    }
}