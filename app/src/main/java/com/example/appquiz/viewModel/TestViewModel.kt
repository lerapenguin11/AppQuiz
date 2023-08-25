package com.example.appquiz.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appquiz.business.models.TestModel
import com.example.appquiz.business.repos.QuestionRepository

class TestViewModel : ViewModel() {
    private val repository = QuestionRepository()

    fun getResulQuestion() : LiveData<MutableList<TestModel>> {

        val mutableData = MutableLiveData<MutableList<TestModel>>()
        repository.getQuestionData(id = id).observeForever { list ->
            mutableData.value = list
        }

        return mutableData
    }

    var id : Int = 0
    var index = 0
}