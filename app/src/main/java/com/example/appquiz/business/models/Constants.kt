package com.example.appquiz.business.models

object Constants{

    fun getQuiz() : MutableList<QuizModel>{
        val quizList = mutableListOf<QuizModel>()

        val quiz1 = QuizModel(0, "UI UX Design", 10, "1 hour 15 min", "Computer", "")
        quizList.add(quiz1)

        return quizList
    }
}