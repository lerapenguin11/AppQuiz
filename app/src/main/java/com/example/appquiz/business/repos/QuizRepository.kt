package com.example.appquiz.business.repos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.appquiz.business.models.Constants
import com.example.appquiz.business.models.QuizModel

class QuizRepository {

    fun getQuizListReading() : LiveData<MutableList<QuizModel>> {
        val quizList = Constants.getQuiz()
        val mutableData = MutableLiveData<MutableList<QuizModel>>()
        val list = mutableListOf<QuizModel>()

        for (i in quizList){
            val id = i.id
            val title = i.title
            val count = i.countQuiz
            val time = i.time
            val tag = i.tagQuiz
            val icon = i.icon

            val listQuizModel = QuizModel(
                id = id,
                title = title,
                countQuiz = count,
                time = time,
                tagQuiz = tag,
                icon = icon
            )
            list.add(listQuizModel)
        }

        mutableData.value = list

        return mutableData
    }
}