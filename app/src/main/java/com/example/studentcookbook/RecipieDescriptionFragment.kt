package com.example.studentcookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.snapshots.Snapshot.Companion.observe
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.studentcookbook.databinding.FragmentDrinkBinding
import com.example.studentcookbook.databinding.FragmentNigerianDishesBinding
import com.example.studentcookbook.databinding.FragmentRecipieDescriptionBinding

class RecipieDescriptionFragment : Fragment() {


    private lateinit var _recipie_data : String

    private lateinit var viewModel: RecipieDescriptionViewmodel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentRecipieDescriptionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_recipie_description,container,false)
        viewModel = ViewModelProviders.of(this).get(RecipieDescriptionViewmodel::class.java)
        val args = RecipieDescriptionFragmentArgs.fromBundle(requireArguments())
        // args.recipeName
        _recipie_data = args.recipeName.toString()
        viewModel.selectContent(_recipie_data)
        viewModel.selectContentName(_recipie_data)
        viewModel.selectContentIngerdient(_recipie_data)
        binding.recipeCookingProcedure.text = viewModel._recipie_description
        binding.recipeName.text = viewModel._recipie_name
        binding.recipeIngredient.text = viewModel._recipie_ingredient
        return binding.root
    }
    }

