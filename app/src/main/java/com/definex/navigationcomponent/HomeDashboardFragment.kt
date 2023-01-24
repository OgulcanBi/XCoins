package com.definex.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.definex.navigationcomponent.databinding.FragmentHomeDashboardBinding

class HomeDashboardFragment : BaseFragment<FragmentHomeDashboardBinding>() {
    private val cryptoRecyclerViewAdapter = CryptoRecyclerViewAdapter(arrayListOf())


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.tv3?.setOnClickListener {
            findNavController().navigate(
                HomeDashboardFragmentDirections.actionHomeDashboarFragmentToFirstFragment(1)
            )
        }

        binding?.cryptoRecyclerViewAdapter?.adapter = cryptoRecyclerViewAdapter
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)

        binding?.cryptoRecyclerViewAdapter?.layoutManager = layoutManager

        cryptoRecyclerViewAdapter.refreshCryptoList(
            arrayListOf(
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.profitTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.lossTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.profitTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.profitTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.lossTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.profitTextColor)
                ),
                MarketModel(
                    "",
                    "BTC",
                    "Bitcoin",
                    "10.24$",
                    "+1.54%",
                    ContextCompat.getColor(requireContext(), R.color.profitTextColor)
                )
            )
        )


    }

    override fun getLayoutId(): Int = R.layout.fragment_home_dashboard
}