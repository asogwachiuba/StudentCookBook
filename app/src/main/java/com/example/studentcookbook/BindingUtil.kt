package com.example.studentcookbook

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("recipeName")
fun TextView.setRecipeName(item: Recipes?){
    item?.let {
        text = item.recipe_name
    }
}
@BindingAdapter("recipeImage")
fun ImageView.setRecipeImage(item: Recipes?) {
    item?.let {
        setImageResource(item.recipe_image)
    }
}