package com.example.demoeni.tptwitter.navfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.demoeni.R
import com.example.demoeni.databinding.FragmentListTwitterBinding
import com.example.demoeni.databinding.FragmentLoginTwitterBinding


class ListTwitterFragment : Fragment() {


    override fun onCreateView(


        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val maVueFragmentList = DataBindingUtil.inflate<FragmentListTwitterBinding>(inflater,R.layout.fragment_list_twitter, container,false)

        // Inflate the layout for this fragment
        return maVueFragmentList.root
    }


}