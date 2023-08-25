package com.example.appquiz.business.models

data class TestModel(
    val idQuiz: Int,
    val idQuestion: Int,
    val question: String,
    val option: List<OptionModel>,
    val positionAnswer: Int,
    val title : String,
    val countQuestion : Int
)
