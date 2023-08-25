package com.example.appquiz.business.models

object Constants{

    fun getQuiz() : MutableList<QuizModel>{
        val quizList = mutableListOf<QuizModel>()

        val quiz1 = QuizModel(1, "UI UX Design", 10, "1 hour 15 min", "Computer", "")
        quizList.add(quiz1)

        return quizList
    }

    fun getTestQuiz() : MutableList<TestModel>{
        val testList = mutableListOf<TestModel>()

        val question1 = TestModel(1, 1, "What is the meaning of UI UX Design ?",
            listOf(
                OptionModel("User Interfoce and User Experience_1", "User Introface and User Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 1, "UI UX Design", 10)

        testList.add(question1)

        val question2 = TestModel(1, 2, "UI UX Design ?",
            listOf(
                OptionModel("xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question2)

        val question3 = TestModel(1, 3, "UI UX Design ?",
            listOf(
                OptionModel("3xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question3)

        val question4 = TestModel(1, 4, "UI UX Design ?",
            listOf(
                OptionModel("4xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question4)

        val question5 = TestModel(1, 5, "UI UX Design ?",
            listOf(
                OptionModel("5xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question5)

        val question6 = TestModel(1, 6, "UI UX Design ?",
            listOf(
                OptionModel("6xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question6)

        val question7 = TestModel(1, 7, "UI UX Design ?",
            listOf(
                OptionModel("7xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question7)

        val question8 = TestModel(1, 8, "UI UX Design ?",
            listOf(
                OptionModel("8xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question8)

        val question9 = TestModel(1, 9, "UI UX Design ?",
            listOf(
                OptionModel("9xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question9)

        val question10 = TestModel(1, 10, "UI UX Design ?",
            listOf(
                OptionModel("10xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question10)

        return testList
    }
}