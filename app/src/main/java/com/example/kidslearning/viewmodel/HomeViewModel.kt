package com.example.kidslearning.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kidslearning.data.model.WelcomeMessage
import com.example.kidslearning.data.repository.HomeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HomeUiState(val welcome: WelcomeMessage)

class HomeViewModel(
    repository: HomeRepository = HomeRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState(repository.getWelcomeMessage()))
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()
}