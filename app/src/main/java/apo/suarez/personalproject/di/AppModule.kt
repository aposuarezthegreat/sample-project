package apo.suarez.personalproject.di

import apo.suarez.navigation.SplashScreenNavigator
import apo.suarez.personalproject.navigation.AppNavigator
import org.koin.dsl.binds
import org.koin.dsl.module

val appModule = module {
    single { AppNavigator() } binds arrayOf(SplashScreenNavigator::class)
}