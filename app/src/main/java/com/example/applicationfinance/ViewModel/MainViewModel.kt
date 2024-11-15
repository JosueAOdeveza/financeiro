package com.example.applicationfinance.ViewModel

import androidx.lifecycle.ViewModel
import com.example.applicationfinance.Repository.MainRepository

class MainViewModel(val repository:MainRepository) : ViewModel() {
    constructor() : this(MainRepository())

    fun loadData() = repository.items
    fun loadBudget() = repository.budget
}