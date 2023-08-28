package com.example.appquiz.business.repos

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.appquiz.business.models.Constants
import com.example.appquiz.business.models.OptionModel
import com.example.appquiz.business.models.QuizModel
import com.example.appquiz.business.models.TestModel

class QuestionRepository() {
    private lateinit var modelQuestion : TestModel

    @SuppressLint("SuspiciousIndentation")
    fun getQuestionData(id: Int) : LiveData<MutableList<TestModel>> {
        val mutableData = MutableLiveData<MutableList<TestModel>>()
        val list = mutableListOf<TestModel>()
        val question = Constants.getTestQuiz()


        for (j in question){
            if (j.idQuiz == id){
                val idItemQuiz = j.idQuiz
                val idQuestion = j.idQuestion
                val question = j.question
                val option_a = j.option.get(0).option_a
                val option_b = j.option.get(0).option_b
                val option_c = j.option.get(0).option_c
                val option_d = j.option.get(0).option_d
                val option_e = j.option.get(0).option_e
                val answer = j.positionAnswer
                val title = j.title
                val option_a_position = j.option.get(0).option_a_position
                val option_b_position = j.option.get(0).option_b_position
                val option_c_position = j.option.get(0).option_c_position
                val option_d_position = j.option.get(0).option_d_position
                val option_e_position = j.option.get(0).option_e_position
                val countQuestion = j.countQuestion

                val listQuestionModel = TestModel(
                    idQuiz = idItemQuiz,
                    idQuestion = idQuestion,
                    question = question,
                    option = listOf(OptionModel(option_a = option_a, option_b = option_b,
                    option_c = option_c, option_d = option_d, option_e = option_e, option_a_position = option_a_position,
                    option_b_position = option_b_position, option_c_position = option_c_position, option_d_position = option_d_position,
                    option_e_position = option_e_position),),
                    positionAnswer = answer, title = title, countQuestion = countQuestion
                )
                modelQuestion = listQuestionModel
                list.add(modelQuestion)
            }
        }

        mutableData.value = list

        return mutableData
    }
}