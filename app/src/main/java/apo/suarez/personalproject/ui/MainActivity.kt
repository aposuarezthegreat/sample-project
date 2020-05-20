package apo.suarez.personalproject.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import apo.suarez.personalproject.R
import apo.suarez.personalproject.navigation.AppNavigator
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }
    private val navigator: AppNavigator by inject()

    override fun onResume() {
        super.onResume()
        
        navigator.bind(navController)
    }

    override fun onPause() {
        super.onPause()

        navigator.unbind()
    }
}
