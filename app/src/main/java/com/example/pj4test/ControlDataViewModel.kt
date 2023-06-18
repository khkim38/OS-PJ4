package com.example.pj4test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ControlDataViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()

    val data: LiveData<String> get() = _data

    fun updateData(newData: String) {
        _data.value = newData
    }
}