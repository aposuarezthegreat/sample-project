package apo.suarez.splashscreen.di

import android.content.Context.MODE_PRIVATE
import apo.suarez.splashscreen.data.SplashScreenPreferences
import apo.suarez.splashscreen.ui.SplashScreenViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    single {
        SplashScreenPreferences(
            sharedPreferences = androidContext().getSharedPreferences("splash_screen_prefs",MODE_PRIVATE)
        )
    }

    viewModel { SplashScreenViewModel(get()) }
}