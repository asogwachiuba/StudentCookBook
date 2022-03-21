package com.example.studentcookbook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.studentcookbook.databinding.RecipeItemViewBinding

class RecipeAdapter : ListAdapter<Recipes,RecipeAdapter.ViewHolder>(RecipeDiffCallback()) {
   //replacing the recyclerview widget with the list adapter
    //var data = listOf<Recipes>()
    //override fun getItemCount() = data.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder private constructor(val binding: RecipeItemViewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: Recipes) {
            binding.recipe = item
            binding.executePendingBindings()
        }
        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding= RecipeItemViewBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

class RecipeDiffCallback: DiffUtil.ItemCallback<Recipes>() {
    override fun areItemsTheSame(oldItem: Recipes, newItem: Recipes): Boolean {
        return oldItem.recipe_name == newItem.recipe_name
    }

    override fun areContentsTheSame(oldItem: Recipes, newItem: Recipes): Boolean {
        return oldItem == newItem
    }

}
