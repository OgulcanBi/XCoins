package com.definex.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.definex.navigationcomponent.databinding.ActivityMainBinding.inflate
import com.definex.navigationcomponent.databinding.FragmentFirstBinding


abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {
    private var _binding: VDB? = null
    protected val binding get() = _binding
    protected abstract fun getLayoutId():Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(
            inflater,getLayoutId(),
            container,
            false
        )
        return binding?.root
    }

}