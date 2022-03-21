package com.example.studentcookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager

import com.example.studentcookbook.databinding.FragmentDrinkBinding


class DrinkFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentDrinkBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_drink,container,false)
        // implementing a grid layout
        val manager = GridLayoutManager(activity, 3)
        binding.drinkList.layoutManager= manager
        // implement recipe adapter
        val adapter = RecipeAdapter()
        binding.drinkList.adapter = adapter
        //adapter.data = nigerian_dishes_recipe
        adapter.submitList(drink_recipe)
        return binding.root
    }
    private val drink_recipe : List<Recipes> = listOf(
            Recipes("Echicha", R.drawable.cookbookpicture8),
            Recipes("Moi-moi",R.drawable.cookbookpicture8),
            Recipes("Okpa", R.drawable.cookbookpicture8),
            Recipes("Beans Porridge", R.drawable.cookbookpicture8),
            Recipes("Jollof Rice", R.drawable.cookbookpicture5),
            Recipes("Coconut Rice", R.drawable.cookbookpicture5),
            Recipes("Rice and Stew", R.drawable.cookbookpicture5),
            Recipes("Echicha", R.drawable.cookbookpicture5),
            Recipes("Moi-moi", R.drawable.cookbookpicture5),
            Recipes("Okpa", R.drawable.cookbookpicture5),
            Recipes("Beans Porridge", R.drawable.cookbookpicture8),
            Recipes("Jollof Rice", R.drawable.cookbookpicture8),
            Recipes("Coconut Rice", R.drawable.cookbookpicture8),
            Recipes("Rice and Stew", R.drawable.cookbookpicture8),
            Recipes("Echicha", R.drawable.cookbookpicture8),
            Recipes("Moi-moi", R.drawable.cookbookpicture8),
            Recipes("Okpa", R.drawable.cookbookpicture5),
            Recipes("Beans Porridge", R.drawable.cookbookpicture5),
            Recipes("Jollof Rice", R.drawable.cookbookpicture5),
            Recipes("Coconut Rice", R.drawable.cookbookpicture5),
            Recipes("Rice and Stew", R.drawable.cookbookpicture5)
    )
}
