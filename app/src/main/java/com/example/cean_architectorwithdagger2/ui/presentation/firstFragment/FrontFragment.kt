package com.example.cean_architectorwithdagger2.ui.presentation.firstFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cean_architectorwithdagger2.R
import com.example.cean_architectorwithdagger2.databinding.FragmentFrontBinding
import com.example.cean_architectorwithdagger2.di.Injectable
import com.example.cean_architectorwithdagger2.di.ViewModelFactory
import com.example.cean_architectorwithdagger2.viewModel.MainViewModel
import javax.inject.Inject

class FrontFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val mainViewModel: MainViewModel by viewModels { viewModelFactory }
    private var _binding: FragmentFrontBinding? = null
    private val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFrontBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mainViewModel.getShareData()
        mainViewModel.shareLiveDate.observe(viewLifecycleOwner, Observer {
            Log.i("jalgas", it.articles.toString())
        })


    }
}