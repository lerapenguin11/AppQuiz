package com.example.appquiz.business.models

data class OptionModel(
    val option_a : String,
    val option_b : String,
    val option_c : String,
    val option_d : String,
    val option_e : String,

    val option_a_position : Int,
    val option_b_position : Int,
    val option_c_position : Int,
    val option_d_position : Int,
    val option_e_position : Int
)