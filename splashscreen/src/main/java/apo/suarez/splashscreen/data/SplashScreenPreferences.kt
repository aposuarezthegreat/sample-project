package apo.suarez.splashscreen.data

import android.content.SharedPreferences
import androidx.core.content.edit

class SplashScreenPreferences(private val sharedPreferences: SharedPreferences){

    val isAppFirstRun: Boolean = sharedPreferences.getBoolean(IS_APP_FIRST_RUN,true)

    fun updateAppFirstRun(isFirstRun: Boolean){
        sharedPreferences.edit() {
            putBoolean(IS_APP_FIRST_RUN,isFirstRun)
            commit()
        }
    }

    companion object{
        private const val IS_APP_FIRST_RUN = "IS_APP_FIRST_RUN"
    }
}