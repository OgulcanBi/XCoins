package com.definex.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.definex.navigationcomponent.databinding.FragmentFirstBinding
import com.definex.navigationcomponent.databinding.FragmentSecondBinding


class SecondFragment :BaseFragment<FragmentSecondBinding>() {

    private val args :SecondFragmentArgs by navArgs()
    override fun getLayoutId(): Int = R.layout.fragment_second

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Toast.makeText(activity,args.toString(),Toast.LENGTH_LONG).show()
//        binding?.tvSecond?.setOnClickListener {
//            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment(22))
//        }
    }


}