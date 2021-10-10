package com.abdushakoor12.expensemanager.navigation

sealed class Screen(val route: String){
    object Login: Screen("login")
}
