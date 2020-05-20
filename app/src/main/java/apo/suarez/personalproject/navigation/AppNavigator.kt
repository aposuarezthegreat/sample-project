package apo.suarez.personalproject.navigation

import androidx.navigation.NavController
import apo.suarez.navigation.SplashScreenNavigator
import apo.suarez.personalproject.R

class AppNavigator: SplashScreenNavigator {

    private var navController : NavController ? = null

    fun bind(navController: NavController){
        this.navController = navController
    }

    fun unbind() {
        this.navController = null
    }

    override fun navigateToLanding() {
        navController?.navigate(R.id.splashFragment_to_landingFragment)
    }
}