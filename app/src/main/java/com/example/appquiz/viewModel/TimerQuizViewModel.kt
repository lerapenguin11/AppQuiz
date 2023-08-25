package com.example.appquiz.viewModel

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.concurrent.TimeUnit

class TimerQuizViewModel : ViewModel(){

    private val _time = MutableLiveData<String>()
    val time: LiveData<String> = _time

    private lateinit var countDownTimer: CountDownTimer
    private val timerDuration = TimeUnit.HOURS.toMillis(1) + TimeUnit.MINUTES.toMillis(15)
    private var remainingTime: Long = timerDuration

    fun startTimer() {
        countDownTimer = object : CountDownTimer(remainingTime, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTime = millisUntilFinished
                val hours = TimeUnit.MILLISECONDS.toHours(millisUntilFinished)
                val minutes = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % 60
                val seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60
                _time.value = String.format("%02d:%02d:%02d", hours, minutes, seconds)
            }

            override fun onFinish() {
                _time.value = "00:00:00"
            }
        }.start()
    }

    fun restartTimer() {
        countDownTimer.cancel()
        remainingTime = timerDuration
            //startTimer()
    }
}