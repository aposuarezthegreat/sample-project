package apo.suarez.splashscreen.ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import apo.suarez.navigation.SplashScreenNavigator
import apo.suarez.splashscreen.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class SplashFragment : Fragment(R.layout.fragment_splash_screen), CoroutineScope by MainScope() {

    private val splashScreenNavigator: SplashScreenNavigator by inject()

    private val viewModel: SplashScreenViewModel by viewModel()

    override fun onResume() {
        super.onResume()

        viewModel.isAppFirstOpen.observe(viewLifecycleOwner, Observer {
            launch {
                navigate(it)
            }
        })
    }

    private suspend fun navigate(isAppFirstStarted: Boolean) {
        delay(3000)

        if (isAppFirstStarted) {
            splashScreenNavigator.navigateToLanding()
        } else {
            splashScreenNavigator.navigateToLanding()
        }
    }
}