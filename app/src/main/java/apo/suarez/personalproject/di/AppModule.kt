package apo.suarez.personalproject.di

import apo.suarez.personalproject.navigation.AppNavigator
import org.koin.dsl.module

val appModule = module {
    single { AppNavigator() }
}