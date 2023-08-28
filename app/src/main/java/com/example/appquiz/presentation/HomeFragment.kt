package com.example.appquiz.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.appquiz.R
import com.example.appquiz.business.db.TestResult
import com.example.appquiz.business.db.TestResultDatabase
import com.example.appquiz.business.models.QuizModel
import com.example.appquiz.databinding.FragmentHomeBinding
import com.example.appquiz.presentation.adapter.QuizAdapter
import com.example.appquiz.presentation.adapter.listener.QuizListener
import com.example.appquiz.viewModel.QuizViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class HomeFragment : Fragment(), QuizListener {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val adapter : QuizAdapter = QuizAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvQuiz.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvQuiz.adapter = adapter

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        observeData()
        displayPoints()
    }

    private fun displayPoints() {
        val database = TestResultDatabase.DatabaseProvider.getDatabase(requireContext())
        val testResultDao = database.testResultDao()

        runBlocking {
            launch(Dispatchers.IO) {
                val previousScore = testResultDao.getTotalScore()
                binding.tvPoint.text = previousScore.toString()
            }
        }
    }

    private fun observeData() {
        val viewModel : QuizViewModel = ViewModelProvider(requireActivity()).get(QuizViewModel::class.java)

        viewModel.getResultQuiz().observe(viewLifecycleOwner, Observer {
            adapter.setItem(it)
        })
    }

    override fun quizList(quiz: QuizModel) {
        val bundle = Bundle()
        bundle.putInt("id", quiz.id)
        bundle.putString("title", quiz.title)
        bundle.putInt("count", quiz.countQuiz)
        bundle.putString("time", quiz.time)
        bundle.putString("tag", quiz.tagQuiz)

        val transaction = activity?.supportFragmentManager?.beginTransaction()
        val fragment = DetailFragment()
        fragment.arguments = bundle
        transaction?.replace(R.id.main_layout, fragment)
        transaction?.commit()
    }
}