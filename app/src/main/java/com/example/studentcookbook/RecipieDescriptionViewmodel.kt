package com.example.studentcookbook

import androidx.lifecycle.*

class RecipieDescriptionViewmodel : ViewModel() {
    lateinit var _recipie_description : String
    lateinit var _recipie_name : String
    lateinit var _recipie_ingredient : String
//  Instances of Recipie data class
    private val okro = Recipie("This is a okro soup", "OKRO SOUP", "Okro soup ingredient currently unavailable." )
    private val sunriseCocktail = Recipie("This is a sunrise cocktail", "sunrise Cocktail", "Sunrise ocktail ingredient currently unavailable.")
    private val strawberryMilkshake = Recipie("This is a strawberry milkshake", "Strawberry Milkshake ", "Strawberry Milkshake ingredient currently unavailable.")
    private val strawberryLemonadeCocktail = Recipie("This is a strawberry lemonade_cocktail", "Strawberry Milkshake ", "Strawberry Milkshake ingredient currently unavailable.")
    private val pomegranateCocktail = Recipie("This is a pomegranate cocktail", "pomegranate Cocktail ", "pomegranateCocktail ingredient currently unavailable.")
    private val kununGyada = Recipie("This is a kunun_gyada", "kunun_gyada ", "kunun_gyada ingredient currently unavailable.")
    private val bitterleaf = Recipie("This is a bitterleaf", "bitterleaf", "bitterleaf ingredient currently unavailable.")
    private val egusi = Recipie("This is a egusi", "egusi", "egusi ingredient currently unavailable.")
    private val oha = Recipie("This is a oha", "oha ", "oha ingredient currently unavailable.")
    private val vegetable = Recipie("This is a vegetable soup", "vegetable soup", "vegetable soup ingredient currently unavailable.")
    private val nsala = Recipie("This is a nsala soup", "nsala soup", "nsala soup ingredient currently unavailable.")
    private val ogbono = Recipie("This is a ogbono soup", "ogbono soup ", "ogbono soup ingredient currently unavailable.")
    private val pepperSoup = Recipie("This is a pepper soup", "pepper soup ", "pepper soup ingredient currently unavailable.")
    private val afang = Recipie("This is a afang soup", "afang soup ", "afang soup ingredient currently unavailable.")
    private val okazi = Recipie("This is a okazi soup", "okazi soup", "okazi soup ingredient currently unavailable.")
    private val gbegiri = Recipie("This is a gbegiri soup", "gbegiri soup ", "gbegiri soup ingredient currently unavailable.")
    private val efoRiro = Recipie("This is a efo riro soup", "efo riro soup", "efo riro soup ingredient currently unavailable.")
    private val banga = Recipie("This is a banga soup", "banga soup ", "banga soup ingredient currently unavailable.")
    private val ofeOwerri = Recipie("This is a ofe_owerri", "ofe_owerri", "ofe_owerri ingredient currently unavailable.")

    // selects recipe to display
    fun selectContent(recipie_key : String) {
        when(recipie_key) {
            "Okro" -> _recipie_description = okro.recipe_description
            "Sunrise_cocktail" -> _recipie_description= sunriseCocktail.recipe_description
            "Strawberry_milkshake" -> _recipie_description =  strawberryMilkshake.recipe_description
            "Strawberry_lemonade_cocktail" -> _recipie_description =  strawberryLemonadeCocktail.recipe_description
            "Pomegranate_cocktail" -> _recipie_description = pomegranateCocktail.recipe_description
            "Kunun_gyada" -> _recipie_description =  kununGyada.recipe_description
            "Bitterleaf" -> _recipie_description =  bitterleaf.recipe_description
            "Egusi" -> _recipie_description =  egusi.recipe_description
            "Oha" -> _recipie_description =  oha.recipe_description
            "Nsala" -> _recipie_description = nsala.recipe_description
            "Ogbono" -> _recipie_description  = ogbono.recipe_description
            "Pepper_soup" -> _recipie_description  = pepperSoup.recipe_description
            "Afang" -> _recipie_description = afang.recipe_description
            "Okazi" -> _recipie_description =  okazi.recipe_description
            "Gbegiri" -> _recipie_description  = gbegiri.recipe_description
            "Efo_riro" -> _recipie_description  = efoRiro.recipe_description
            "Banga" -> _recipie_description =  banga.recipe_description
            "Ofe_owerri" -> _recipie_description = ofeOwerri.recipe_description
            "Vegetable" -> _recipie_description = vegetable.recipe_description
        }}

    fun selectContentName(recipie_key : String) {
        when(recipie_key) {
            "Okro" -> _recipie_name = okro.recipe_name
            "Sunrise_cocktail" -> _recipie_name= sunriseCocktail.recipe_name
            "Strawberry_milkshake" -> _recipie_name =  strawberryMilkshake.recipe_name
            "Strawberry_lemonade_cocktail" -> _recipie_name =  strawberryLemonadeCocktail.recipe_name
            "Pomegranate_cocktail" -> _recipie_name = pomegranateCocktail.recipe_name
            "Kunun_gyada" -> _recipie_name =  kununGyada.recipe_name
            "Bitterleaf" -> _recipie_name =  bitterleaf.recipe_name
            "Egusi" -> _recipie_name =  egusi.recipe_name
            "Oha" -> _recipie_name =  oha.recipe_name
            "Nsala" -> _recipie_name = nsala.recipe_name
            "Ogbono" -> _recipie_name  = ogbono.recipe_name
            "Pepper_soup" -> _recipie_name  = pepperSoup.recipe_name
            "Afang" -> _recipie_name = afang.recipe_name
            "Okazi" -> _recipie_name =  okazi.recipe_name
            "Gbegiri" -> _recipie_name  = gbegiri.recipe_name
            "Efo_riro" -> _recipie_name  = efoRiro.recipe_name
            "Banga" -> _recipie_name =  banga.recipe_name
            "Ofe_owerri" -> _recipie_name = ofeOwerri.recipe_name
            "Vegetable" -> _recipie_name = vegetable.recipe_name
        }}
    fun selectContentIngerdient(recipie_key : String) {
        when(recipie_key) {
            "Okro" -> _recipie_ingredient = okro.recipe_ingredient
            "Sunrise_cocktail" -> _recipie_ingredient= sunriseCocktail.recipe_ingredient
            "Strawberry_milkshake" -> _recipie_ingredient =  strawberryMilkshake.recipe_ingredient
            "Strawberry_lemonade_cocktail" -> _recipie_ingredient =  strawberryLemonadeCocktail.recipe_ingredient
            "Pomegranate_cocktail" -> _recipie_ingredient = pomegranateCocktail.recipe_ingredient
            "Kunun_gyada" -> _recipie_ingredient =  kununGyada.recipe_ingredient
            "Bitterleaf" -> _recipie_ingredient =  bitterleaf.recipe_ingredient
            "Egusi" -> _recipie_ingredient =  egusi.recipe_ingredient
            "Oha" -> _recipie_ingredient =  oha.recipe_ingredient
            "Nsala" -> _recipie_ingredient = nsala.recipe_ingredient
            "Ogbono" -> _recipie_ingredient  = ogbono.recipe_ingredient
            "Pepper_soup" -> _recipie_ingredient  = pepperSoup.recipe_ingredient
            "Afang" -> _recipie_ingredient = afang.recipe_ingredient
            "Okazi" -> _recipie_ingredient =  okazi.recipe_ingredient
            "Gbegiri" -> _recipie_ingredient  = gbegiri.recipe_ingredient
            "Efo_riro" -> _recipie_ingredient  = efoRiro.recipe_ingredient
            "Banga" -> _recipie_ingredient =  banga.recipe_ingredient
            "Ofe_owerri" -> _recipie_ingredient = ofeOwerri.recipe_ingredient
            "Vegetable" -> _recipie_ingredient = vegetable.recipe_ingredient
        }}
        // recipe data class
    data class Recipie(val recipe_description :String, val recipe_name: String, val recipe_ingredient :String ){}

    }