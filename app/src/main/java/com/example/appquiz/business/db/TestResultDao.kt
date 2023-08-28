package com.example.appquiz.business.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TestResultDao {
    @Insert
    fun insert(testResult: TestResult)

    @Query("SELECT SUM(score*10) FROM test_results")
    fun getTotalScore(): Int
}