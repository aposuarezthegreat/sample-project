package apo.suarez.splashscreen.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import apo.suarez.splashscreen.data.SplashScreenPreferences

class SplashScreenViewModel(splashScreenPreferences: SplashScreenPreferences) : ViewModel() {

    private val _isAppFirstOpenLiveData: MutableLiveData<Boolean> = MutableLiveData()

    val isAppFirstOpen: LiveData<Boolean> get() = _isAppFirstOpenLiveData

    init {
        _isAppFirstOpenLiveData.value = splashScreenPreferences.isAppFirstRun
    }
}
