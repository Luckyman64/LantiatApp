package com.example.lantiatapp

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val textInit = MutableStateFlow(false)

    fun changeEtat(){
        viewModelScope.launch {
            textInit.value = !textInit.value
        }
        Log.d(TAG, textInit.value.toString())
    }
}