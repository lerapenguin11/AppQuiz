package com.example.appquiz.presentation.adapter.listener

import com.example.appquiz.business.models.QuizModel

interface QuizListener {

    fun quizList(quiz : QuizModel)
}