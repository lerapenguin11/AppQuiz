package com.example.appquiz.utilits

import androidx.fragment.app.Fragment
import com.example.appquiz.APP_MAIN_ACTIVITY_QUIZ
import com.example.appquiz.R

fun replaceFragmentMainActivityQuizApp(fragmentt: Fragment, check: Boolean = true) {
    if (check) {
        APP_MAIN_ACTIVITY_QUIZ.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.main_layout,
                fragmentt
            ).commit()
    } else {
        APP_MAIN_ACTIVITY_QUIZ.supportFragmentManager.beginTransaction()
            .replace(
                R.id.main_layout,
                fragmentt
            ).commit()
    }
}