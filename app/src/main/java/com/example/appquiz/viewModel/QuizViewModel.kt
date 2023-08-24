package com.example.appquiz.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appquiz.business.models.QuizModel
import com.example.appquiz.business.repos.QuizRepository

class QuizViewModel : ViewModel() {

    private val repository  = QuizRepository()

    fun getResultQuiz() : LiveData<MutableList<QuizModel>> {
        val mutableData = MutableLiveData<MutableList<QuizModel>>()
        repository.getQuizListReading().observeForever {list ->
            mutableData.value = list
        }

        return mutableData
    }
}