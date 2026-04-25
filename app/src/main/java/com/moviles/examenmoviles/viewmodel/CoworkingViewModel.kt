package com.moviles.examenmoviles.viewmodel

import androidx.lifecycle.ViewModel
import com.moviles.examenmoviles.model.CoworkingSpace
import com.moviles.examenmoviles.repository.CoworkingRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CoworkingViewModel : ViewModel() {
    private val repository = CoworkingRepository()

    private val _spaces = MutableStateFlow(repository.getSpaces())
    val spaces: StateFlow<List<CoworkingSpace>> = _spaces

    fun getSpaceById(id: Int): CoworkingSpace? = repository.getSpaceById(id)
}
