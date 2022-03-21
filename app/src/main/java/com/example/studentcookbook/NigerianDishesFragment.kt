package com.example.studentcookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.studentcookbook.databinding.FragmentNigerianDishesBinding


class NigerianDishesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentNigerianDishesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_nigerian_dishes,container,false)
        // implementing a grid layout
        val manager = GridLayoutManager(activity, 3)
        binding.nigerianDishesList.layoutManager= manager
        // implement recipe adapter
        val adapter = RecipeAdapter()
        binding.nigerianDishesList.adapter = adapter
        //adapter.data = nigerian_dishes_recipe
        adapter.submitList(nigerian_dishes_recipe)
        return binding.root
    }
    private val nigerian_dishes_recipe : List<Recipes> = listOf(
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