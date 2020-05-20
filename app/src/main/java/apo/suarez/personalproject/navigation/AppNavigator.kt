package apo.suarez.personalproject.navigation

import androidx.navigation.NavController

class AppNavigator {

    private var navController : NavController ? = null

    fun bind(navController: NavController){
        this.navController = navController
    }

    fun unbind() {
        this.navController = null
    }
}