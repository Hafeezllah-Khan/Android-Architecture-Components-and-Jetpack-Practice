package com.example.androidarchitecturecomponentsandjetpackpractice.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel: ViewModel(){

    private val liveDataObj = MutableLiveData<String>("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2gqwFPG8D23OL5iVjq-ezr1OFKGOkJOfssw&usqp=CAU")
    val liveData: LiveData<String>
        get() = liveDataObj

    fun updateData(){
        liveDataObj.value = "https://process.filestackapi.com/resize=width:600,height:315,fit:max/quality=value:90/yJ8ZDvRpQ4mfBKEt9XNS"
    }
}