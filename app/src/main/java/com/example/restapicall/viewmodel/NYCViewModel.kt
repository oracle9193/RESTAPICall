package com.example.restapicall.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapicall.network.NYCApi
import com.example.restapicall.network.NYCApiService
import kotlinx.coroutines.launch

class NYCViewModel: ViewModel() {

    var nycUiState: String by mutableStateOf("")
        private set


    init {
        getNYCList()
    }
    fun getNYCList() {
        //  marsUiState = "Set the Mars API status response here!"
        viewModelScope.launch {
            val listResult = NYCApi.retrofitService.getPhotos()
            nycUiState = listResult
        }
    }
}