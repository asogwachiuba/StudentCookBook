package com.example.studentcookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.studentcookbook.databinding.FragmentSnacksBinding


class SnacksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentSnacksBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_snacks,container,false)
        // implementing a grid layout
        val manager = GridLayoutManager(activity, 3)
        binding.snackList.layoutManager= manager
        // implement recipe adapter
        val adapter = RecipeAdapter()
        binding.snackList.adapter = adapter
        //adapter.data = nigerian_dishes_recipe
        adapter.submitList(snack_recipe)
        return binding.root
    }
    private val snack_recipe : List<Recipes> = listOf(
            Recipes("Echicha", R.drawable.cookbookpicture8),
            Recipes("Moi-moi", R.drawable.cookbookpicture8),
            Recipes("Okpa", R.drawable.cookbookpicture8),
            Recipes("Beans Porridge", R.drawable.cookbookpicture8),
            Recipes("Jollof Rice", R.drawable.cookbookpicture5),
            Recipes("Coconut Rice", R.drawable.cookbookpicture5),
            Recipes("Rice and Stew", R.drawable.cookbookpicture5),
            Recipes("Echicha", R.drawable.cookbookpicture5),
            Recipes("Moi-moi", R.drawable.cookbookpicture5),
            Recipes("Okpa", R.drawable.cookbookpicture5),
            Recipes("Beans Porridge", R.drawable.soup1),
            Recipes("Jollof Rice", R.drawable.soup2),
            Recipes("Coconut Rice", R.drawable.soup3),
            Recipes("Rice and Stew", R.drawable.sun1),
            Recipes("Echicha", R.drawable.sun1),
            Recipes("Moi-moi", R.drawable.soup3),
            Recipes("Okpa", R.drawable.soup2),
            Recipes("Beans Porridge", R.drawable.soup1),
            Recipes("Jollof Rice", R.drawable.soup3),
            Recipes("Coconut Rice", R.drawable.soup2),
            Recipes("Rice and Stew", R.drawable.soup1)
    )
}