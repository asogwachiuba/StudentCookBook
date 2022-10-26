package com.example.studentcookbook

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.studentcookbook.databinding.FragmentOptionBinding

class OptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentOptionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_option,container,false)
        binding.drinkBtn.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_optionFragment_to_drinkFragment) }
        binding.nigerianDishesBtn.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_optionFragment_to_nigerianDishesFragment) }
        binding.nigerianSoupsBtn.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_optionFragment_to_nigerianSoupsFragment) }
        binding.snacksBtn.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_optionFragment_to_snacksFragment) }
        return binding.root
    }
    }
