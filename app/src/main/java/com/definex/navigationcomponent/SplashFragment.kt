package com.definex.navigationcomponent

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.definex.navigationcomponent.databinding.FragmentSplashBinding


class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_splash
    override var bottomNavigationViewVisibility = View.GONE

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requireActivity().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        Handler().postDelayed(
            {
                findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeNavigation())
            }, 3000
        )
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }
}