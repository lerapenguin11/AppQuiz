package com.example.appquiz.utilits

import androidx.fragment.app.Fragment
import com.example.appquiz.APP_MAIN_ACTIVITY_QUIZ
import com.example.appquiz.R

fun replaceFragmentMainActivityCardGame(fragm: Fragment, st: Boolean = true) {
    if (st) {
        APP_MAIN_ACTIVITY_QUIZ.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.main_layout,
                fragm
            ).commit()
    } else {
        APP_MAIN_ACTIVITY_QUIZ.supportFragmentManager.beginTransaction()
            .replace(
                R.id.main_layout,
                fragm
            ).commit()
    }
}