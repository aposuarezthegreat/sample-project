package apo.suarez.personalproject

import androidx.multidex.MultiDexApplication
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import apo.suarez.personalproject.di.appModule

class PersonalProject : MultiDexApplication(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PersonalProject)
            modules(koinModules())
        }
    }

    private fun koinModules() = listOf(
        appModule
    )
}