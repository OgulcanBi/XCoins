package com.definex.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.definex.navigationcomponent.databinding.FragmentFirstBinding


class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_first
//    private val args :FirstFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Toast.makeText(activity,args.toString(),Toast.LENGTH_LONG).show()
//        binding?.tvFirst?.setOnClickListener {
//            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(11))
//        }
    }


}