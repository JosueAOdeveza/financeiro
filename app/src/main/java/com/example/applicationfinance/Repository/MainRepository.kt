package com.example.applicationfinance.Repository

import com.example.applicationfinance.Domain.BudgetDomain
import com.example.applicationfinance.Domain.ExpenseDomain

class MainRepository {
    val items= mutableListOf(
        ExpenseDomain( "Restaurante", 573.12, "img1", "17 jun 2024 19:15"),
        ExpenseDomain( "McDonald", 72.82, "img2", "16 jun 2024 13:57"),
        ExpenseDomain( "Cinema", 23.47, "img3", "16 jun 2024 20:45"),
        ExpenseDomain( "Restaurante", 341.12, "img1", "15 jun 2024 22:18")
    )

    val budget= mutableListOf(

            BudgetDomain("Home Loan",1200.0,80.9),
            BudgetDomain("Subscription",1200.0,10.0),
            BudgetDomain("Car Loan",800.0,30.0)
        )

}