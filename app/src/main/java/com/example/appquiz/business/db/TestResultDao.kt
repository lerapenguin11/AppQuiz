package com.example.appquiz.business.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TestResultDao {
    @Insert
    fun insert(testResult: TestResult)

    @Query("SELECT SUM(score) FROM test_results")
    fun getTotalScore(): Int
}