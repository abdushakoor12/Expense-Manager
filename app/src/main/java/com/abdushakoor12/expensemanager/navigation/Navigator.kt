package com.abdushakoor12.expensemanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abdushakoor12.expensemanager.ui.screens.login.LoginScreen

@Composable
fun ExpenseManagerNavigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route){

        composable(Screen.Login.route){
            LoginScreen()
        }

    }
}