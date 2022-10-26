package com.example.studentcookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.studentcookbook.databinding.FragmentNigerianSoupsBinding


class NigerianSoupsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentNigerianSoupsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_nigerian_soups,container,false)
        // implementing a grid layout
        val manager = GridLayoutManager(activity, 3)
        binding.nigerianSoupList.layoutManager= manager
        // implement recipe adapter
        val adapter = RecipeAdapter()
        binding.nigerianSoupList.adapter = adapter
        //adapter.data = nigerian_dishes_recipe
        adapter.submitList(nigerian_soup_recipe)
        return binding.root
    }
    private val nigerian_soup_recipe : List<Recipes> = listOf(
            Recipes("Okro Soup",R.drawable.soup1),
            Recipes("Bitterleaf Soup",R.drawable.soup2),
            Recipes("Egusi Soup",R.drawable.soup3),
            Recipes("Oha Soup",R.drawable.soup1),
            Recipes("Vegetable Soup",R.drawable.soup2),
            Recipes("Nsala Soup",R.drawable.soup3),
            Recipes("Ogbono Soup",R.drawable.soup1),
            Recipes("Pepper Soup",R.drawable.soup2),
            Recipes("Afang Soup",R.drawable.soup3),
            Recipes("Okazi Soup",R.drawable.soup1),
            Recipes("Gbegiri Soup",R.drawable.soup2),
            Recipes("EfoRiro Soup",R.drawable.soup3),
            Recipes("Banga Soup",R.drawable.soup1),
            Recipes("Ofe Owerri Soup",R.drawable.soup2),
            Recipes("Okro Soup",R.drawable.soup1),
            Recipes("Bitterleaf Soup",R.drawable.soup2),
            Recipes("Egusi Soup",R.drawable.soup3),
            Recipes("Oha Soup",R.drawable.soup1),
            Recipes("Vegetable Soup",R.drawable.soup2),
            Recipes("Nsala Soup",R.drawable.soup3),
            Recipes("Ogbono Soup",R.drawable.soup1),
            Recipes("Pepper Soup",R.drawable.soup2),
            Recipes("Afang Soup",R.drawable.soup3),
            Recipes("Okazi Soup",R.drawable.soup1),
            Recipes("Gbegiri Soup",R.drawable.soup2),
            Recipes("EfoRiro Soup",R.drawable.soup3),
            Recipes("Banga Soup",R.drawable.soup1),
            Recipes("Ofe Owerri Soup",R.drawable.soup2)
            )
}