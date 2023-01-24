package com.definex.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import com.definex.navigationcomponent.databinding.FragmentProfileDashboardBinding

class PortfolioDashboardFragment : BaseFragment<FragmentProfileDashboardBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_profile_dashboard

//    private val portfolioGraph by lazy { findNavController().graph.findNode(R.id.my_nav)  as NavGraph}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.portfolioTextView?.setOnClickListener {

            findNavController().navigate(PortfolioDashboardFragmentDirections.actionPortfolioDashboarFragmentToSecondFragment(22))
        }
    }


}