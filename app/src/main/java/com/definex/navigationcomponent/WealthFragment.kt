package com.definex.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.definex.navigationcomponent.databinding.FragmentSplashBinding
import com.definex.navigationcomponent.databinding.FragmentWealthBinding

class WealthFragment : BaseFragment<FragmentWealthBinding>() {
    override fun getLayoutId(): Int = R.layout.fragment_wealth

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentList = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )
        binding?.viewPager?.adapter= WealthViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)



    }

}