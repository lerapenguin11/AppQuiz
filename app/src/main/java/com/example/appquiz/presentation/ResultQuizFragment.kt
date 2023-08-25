package com.example.appquiz.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appquiz.R
import com.example.appquiz.business.db.TestResult
import com.example.appquiz.business.db.TestResultDatabase
import com.example.appquiz.databinding.FragmentDetailBinding
import com.example.appquiz.databinding.FragmentResultQuizBinding
import com.example.appquiz.utilits.replaceFragmentMainActivityCardGame
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ResultQuizFragment : Fragment() {
    private var _binding : FragmentResultQuizBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultQuizBinding.inflate(inflater, container, false)

        val countQuestion = arguments?.getInt("countQuestions")
        val result = arguments?.getInt("result")
        binding.tvResult.text = result.toString() + "/" + countQuestion.toString()
        println(result.toString() + " " + countQuestion)

        val database = TestResultDatabase.DatabaseProvider.getDatabase(requireContext())
        val testResultDao = database.testResultDao()


        runBlocking {
            launch(Dispatchers.IO) {
                val previousScore = testResultDao.getTotalScore()
                val newScore = previousScore + result!!
                // Do something with the totalScore
                val testResult = TestResult(score = newScore * 10)
                testResultDao.insert(testResult)

            }
        }

        if (result!! >=9){
            binding.icStarOne.setImageResource(R.drawable.ic_star_win)
            binding.icStarTwo.setImageResource(R.drawable.ic_star_win)
            binding.icStarFree.setImageResource(R.drawable.ic_star_win)
        }
        if (5 < result!! && result<9){
            binding.icStarOne.setImageResource(R.drawable.ic_star_win)
            binding.icStarTwo.setImageResource(R.drawable.ic_star_win)
            binding.icStarFree.setImageResource(R.drawable.ic_star)
        } else{
            binding.icStarOne.setImageResource(R.drawable.ic_star_win)
            binding.icStarTwo.setImageResource(R.drawable.ic_star)
            binding.icStarFree.setImageResource(R.drawable.ic_star)
        }

        binding.textView13.text = "Your reward" + " " + (result!! *10).toString()

        binding.btNext.setOnClickListener {
            replaceFragmentMainActivityCardGame(HomeFragment())
        }

        return binding.root
    }
}