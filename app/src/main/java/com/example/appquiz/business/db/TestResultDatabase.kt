package com.example.appquiz.business.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TestResult::class], version = 1)
abstract class TestResultDatabase : RoomDatabase() {
    abstract fun testResultDao(): TestResultDao

    object DatabaseProvider {
        private var database: TestResultDatabase? = null

        fun getDatabase(context: Context): TestResultDatabase {
            return database ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TestResultDatabase::class.java,
                    "test_result_database"
                ).build()
                database = instance
                instance
            }
        }
    }
}
