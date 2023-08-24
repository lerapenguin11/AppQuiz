package com.example.appquiz.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appquiz.R
import com.example.appquiz.databinding.FragmentDetailBinding
import com.example.appquiz.databinding.FragmentHomeBinding
import com.example.appquiz.utilits.replaceFragmentMainActivityCardGame
import kotlin.properties.Delegates

class DetailFragment : Fragment() {

    private var _binding : FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private var idQuiz by Delegates.notNull<Int>()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        binding.tvTitleQuizDetails.text = arguments?.getString("title")
        val count = arguments?.getInt("count")
        binding.tvGetPoints.text = getString(R.string.get) +  " " + (count!! * 10).toString() + getString(R.string.point)
        binding.tvCountQuiz.text = count.toString() + " " + getString(R.string.question)
        binding.tvCountQuizDesc.text = count.toString() + " " + getString(R.string.point_for_correct_answer)
        binding.tvTimeQuizDetails.text = arguments?.getString("time")
        binding.tvRulePoint.text = count.toString() + " " + getString(R.string.rule_point)
        binding.tvTagDetails.text = "#" + arguments?.getString("tag")

        binding.btStartQuiz.setOnClickListener {
            idQuiz = arguments?.getInt("id")!!
            //TODO ЕРЕДАТЬ ID in VIEWMODEL
            replaceFragmentMainActivityCardGame(TestFragment())
        }

        return binding.root
    }
}