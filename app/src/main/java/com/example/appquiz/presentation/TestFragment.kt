package com.example.appquiz.presentation

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appquiz.R
import com.example.appquiz.databinding.FragmentTestBinding
import com.example.appquiz.utilits.replaceFragmentMainActivityCardGame
import com.example.appquiz.viewModel.TestViewModel

class TestFragment() : Fragment() {
    private lateinit var testViewModel : TestViewModel
    private var _binding : FragmentTestBinding? = null
    private val binding get() = _binding!!
    private var position = 0
    private var checkClick = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTestBinding.inflate(inflater, container, false)

        testViewModel = ViewModelProvider(requireActivity()).get(
            TestViewModel::class.java)

        return binding.root
    }

    @SuppressLint("SetTextI18n")
    private fun loadQuestions(positionItem : Int) {

        testViewModel.getResulQuestion().observe(viewLifecycleOwner, Observer {questions ->
            binding.titleTest.text = questions.get(positionItem).title + " " + getString(R.string.quiz)
            binding.tvQuestion.text = questions.get(positionItem).question
            binding.tvOptionA.text = questions.get(positionItem).option.get(0).option_a
            binding.tvOptionB.text = questions.get(positionItem).option.get(0).option_b
            binding.tvOptionC.text = questions.get(positionItem).option.get(0).option_c
            binding.tvOptionD.text = questions.get(positionItem).option.get(0).option_d
            binding.tvOptionE.text = questions.get(positionItem).option.get(0).option_e

            optionsClick(questions.get(positionItem).positionAnswer, questions.get(positionItem).option.get(0).option_a_position,
                questions.get(positionItem).option.get(0).option_b_position, questions.get(positionItem).option.get(0).option_c_position,
                questions.get(positionItem).option.get(0).option_d_position, questions.get(positionItem).option.get(0).option_e_position)

            newQuestion(questions.get(positionItem).countQuestion, questions.get(positionItem).idQuestion)

            testViewModel.index++
        })
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun newQuestion(countQuestion: Int, idQuestion: Int) {
        if (countQuestion == idQuestion){
            binding.btNext.background = resources.getDrawable(R.drawable.bg_count_test)
            binding.btSubmitQuiz.setOnClickListener {
                replaceFragmentMainActivityCardGame(HomeFragment())
            }
        } else{
            binding.btNext.setOnClickListener {
                updateOptionsClick()
                loadQuestions(testViewModel.index)
                checkClick = true
            }
        }
    }

    private fun updateOptionsClick() {
        notIndicator(binding.tvOptionA, binding.optionA)
        notIndicator(binding.tvOptionB, binding.optionB)
        notIndicator(binding.tvOptionC, binding.optionC)
        notIndicator(binding.tvOptionD, binding.optionD)
        notIndicator(binding.tvOptionE, binding.optionE)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun notIndicator(tvOption: TextView, option: ConstraintLayout) {
        tvOption.setTextColor(Color.parseColor("#333333"))
        option.background = resources.getDrawable(R.drawable.bg_count_test)
    }

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceAsColor")
    private fun optionsClick(
        position_answer: Int, option_a_position: Int,
        option_b_position: Int, option_c_position: Int, option_d_position: Int, option_e_position: Int
    ) {
        binding.boxOptionA.setOnClickListener {
            if (checkClick){
                clickIndicator(binding.tvOptionA, binding.optionA)
                checkClick = false
                if (position_answer == option_a_position){
                    //TODO считать очки
                }
            }
        }

        binding.boxOptionB.setOnClickListener {
            if (checkClick){
                clickIndicator(binding.tvOptionB, binding.optionB)
                checkClick = false
                if (position_answer == option_b_position){
                    //TODO считать очки
                }
            }
        }

        binding.boxOptionC.setOnClickListener {
            if (checkClick){
                clickIndicator(binding.tvOptionC, binding.optionC)
                checkClick = false
                if (position_answer == option_c_position){
                    //TODO считать очки
                }
            }
        }

        binding.boxOptionD.setOnClickListener {
            if (checkClick){
                clickIndicator(binding.tvOptionD, binding.optionD)
                checkClick = false
                if (position_answer == option_d_position){
                    //TODO считать очки
                }
            }
        }

        binding.boxOptionE.setOnClickListener {
            if (checkClick){
                clickIndicator(binding.tvOptionE, binding.optionE)
                checkClick = false
                if (position_answer == option_e_position){
                    //TODO считать очки
                }
            }
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun clickIndicator(tvOption: TextView, option: ConstraintLayout) {
        tvOption.setTextColor(Color.parseColor("#3550DC"))
        option.background = resources.getDrawable(R.drawable.bg_indicator)
    }

    override fun onResume() {
        super.onResume()
        loadQuestions(testViewModel.index)
        onClick()
    }

    private fun onClick() {
        binding.icArrowHome.setOnClickListener {
            replaceFragmentMainActivityCardGame(HomeFragment())
        }
    }
}