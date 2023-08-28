package com.example.appquiz.business.models

object Constants{

    fun getQuiz() : MutableList<QuizModel>{
        val quizList = mutableListOf<QuizModel>()

        val quiz1 = QuizModel(1, "UI And Ux Design", 10, "1 hour 15 min", "Computer", "https://bereev.com/wp-content/uploads/2021/08/Dashboard-1024x768.png")
        quizList.add(quiz1)

        val quiz2 = QuizModel(2, "Science Quiz", 10, "1 hour 15 min", "Computer", "https://www.jing.fm/clipimg/full/121-1215638_biology-science-png-biology-chemistry-science.png")
        quizList.add(quiz2)

        val quiz3 = QuizModel(3, "Biology Quiz", 10, "1 hour 15 min", "Biology", "https://www.kampustenevar.com/upload/Moleku¦êler-Biyoloji-ve-Genetik-Bo¦êlu¦êmu¦ê-Hakk¦-nda-Her-S¦gey_87900.png")
        quizList.add(quiz3)

        return quizList
    }

    fun getTestQuiz() : MutableList<TestModel>{
        val testList = mutableListOf<TestModel>()

        //quiz 1
        val question1 = TestModel(1, 1, "Which of the following are examples of UI?",
            listOf(
                OptionModel("Key (for opening door)", "TV Remote",
                    "Button (in an app)", "All of the above",
                "Using Interface and Using Experience_", 1, 2, 3, 4, 5)
            ), 4, "UI And Ux Design", 10)

        testList.add(question1)

        val question2 = TestModel(1, 2, "What are some good examples of UX?",
            listOf(
                OptionModel("Duolingo", "Paypal",
                            "MailChimp", "All of the above",
                    "Using Interface and Using", 1, 2, 3, 4, 5)
            ), 4, "UI And Ux Design", 10)

        testList.add(question2)

        val question3 = TestModel(1, 3, "Which is the correct sequence of Design Thinking?",
            listOf(
                OptionModel("Research -> Analysis -> Define -> Design -> Test ", "Define -> Research -> Analysis -> Design -> Test ",
                    "Define -> Research -> Design -> Test  -> Analysis  ",
                            "Design -> Test  -> Analysis -> Define -> Research ->",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question3)

        val question4 = TestModel(1, 4, "Which is the right example for Contextual UX?",
            listOf(
                OptionModel("UI", "UX",
                    "User Interf", "ser Experience",
                    "Interface and Using Experience", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question4)

        val question5 = TestModel(1, 5, "What is usability?",
            listOf(
                OptionModel("Quality attribute that measures how easy user interfaces are to use.", "Methods for improving ease-of-use during the design process.",
                    "Both A and B", "None of the above",
                    "A", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question5)

        val question6 = TestModel(1, 6, "How many websites fail at UX?",
            listOf(
                OptionModel("94%", "56%",
                    "93%", "60%",
                    "70%", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question6)

        val question7 = TestModel(1, 7, "Which company created Bootstrap UI framework?",
            listOf(
                OptionModel("Apple", "Twitter",
                    "Google", "Microsoft",
                    "YT", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question7)

        val question8 = TestModel(1, 8, "The term \"User Experience\" was coined by whom?",
            listOf(
                OptionModel("Don Norman",
                        "Bill Gates",
                    "Jakob", "None of the above",
                    "Using Interface and Using Exp", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question8)

        val question9 = TestModel(1, 9, "What does UI stand for in UI and UX design?",
            listOf(
                OptionModel("User Interaction", "User Interface", "User Integration", "User Involvement", "User Insight"
                    , 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question9)

        val question10 = TestModel(1, 10, "Which of the following is NOT a common goal of UI design?",
            listOf(
                OptionModel("Enhancing usability", "Creating visually appealing interfaces",
                    "Increasing user engagement", "Maximizing user frustration",
                    "Improving user satisfaction", 1, 2, 3, 4, 5)
            ), 2, "UI And Ux Design", 10)

        testList.add(question10)

        //quiz2
        val question21 = TestModel(2, 1, "What is the purpose of wireframes in UI design?",
            listOf(
                OptionModel("Testing user interactions", "Creating high-fidelity prototypes",
                    "Defining visual hierarchy and layout", "Gathering user feedback",
                    "Conducting usability testing", 1, 2, 3, 4, 5)
            ), 1, "Science Quiz", 10)

        testList.add(question21)

        val question22 = TestModel(2, 2, "Which principle of UX design focuses on making interfaces intuitive and easy to use?",
            listOf(
                OptionModel("Consistency", "Feedback",
                    "Efficiency", "Learnability",
                    "Flexibility", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question22)

        val question23 = TestModel(2, 3, "What is the main difference between UI and UX design?",
            listOf(
                OptionModel("UI design focuses on aesthetics, while UX design focuses on functionality", "UI design focuses on functionality, while UX design focuses on aesthetics",
                    "UI design focuses on user interactions, while UX design focuses on visual elements", "User Interface and User Experience",
                    "Using Interface and Using Experience", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question23)

        val question24 = TestModel(2, 4, "Which of the following is NOT a common element of good UI design?",
            listOf(
                OptionModel("Clear and concise labeling", "Consistent visual style", "Minimalistic and clutter-free layout",
                        "Overuse of animations and effects",
                    "Intuitive navigation", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question24)

        val question25 = TestModel(2, 5, "What is the purpose of user personas in UX design?",
            listOf(
                OptionModel("Identifying target audience", "Creating user scenarios",
                    "Conducting user interviews", "Defining user goals and needs",
                    "Developing user interface guidelines", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question25)

        val question26 = TestModel(2, 6, "What is the purpose of A/B testing in UI and UX design?",
            listOf(
                OptionModel("Gathering user feedback", "Improving website performance",
                    "Comparing multiple design variations",
                    "Analyzing user behavior",
                "Conducting usability testing" , 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question26)

        val question27 = TestModel(2, 7, "Which of the following is NOT a common UX design pattern?",
            listOf(
                OptionModel("Card-based design",
                        "Hamburger menu",
                        "Infinite scrolling",
                        "Parallax scrolling",
                        "Comic Sans font", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question27)

        val question28 = TestModel(2, 8, "What is the role of UI and UX design in creating a successful product?",
            listOf(
                OptionModel( "Attracting and retaining users",
                        "Enhancing brand identity",
                        "Increasing user satisfaction",
                    "Improving usability and accessibility",
        "All of the above", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question28)

        val question29 = TestModel(2, 9, "Who was the first President of the United States?",
            listOf(
                OptionModel("George Washington",
                        "Abraham Lincoln",
                        "Thomas Jefferson",
                    "John F. Kennedy",
        "Franklin D. Roosevelt", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question29)

        val question210 = TestModel(2, 10, "Which war was fought between the North and the South in the United States?",
            listOf(
                OptionModel("World War I",
                        "World War II",
                        "Civil War",
                    "American Revolution",
        "Vietnam War", 1, 2, 3, 4, 5)
            ), 2, "Science Quiz", 10)

        testList.add(question210)

        //quiz3
        val question31 = TestModel(3, 1, "What is the meaning of UI UX Design ?",
            listOf(
                OptionModel("User Interfoce and User Experience_1", "User Introface and User Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 1, "UI UX Design", 10)

        testList.add(question31)

        val question32 = TestModel(3, 2, "Who discovered America?",
            listOf(
                OptionModel("Christopher Columbus",
                        "Marco Polo",
                        "Vasco da Gama",
                    "Ferdinand Magellan",
        "Amerigo Vespucci", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design", 10)

        testList.add(question32)

        val question33 = TestModel(3, 3, "Which country was responsible for the construction of the Great Wall?",
            listOf(
                OptionModel( "China",
                        "India",
                        "Egypt",
                    "Greece",
                "Rome", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design", 10)

        testList.add(question33)

        val question34 = TestModel(3, 4, " Who was the leader of the Soviet Union during World War II?",
            listOf(
                OptionModel("Vladimir Lenin",
                        "Joseph Stalin",
                        "Mikhail Gorbachev",
                    "Nikita Khrushchev",
        "Boris Yeltsin", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design", 10)

        testList.add(question34)

        val question35 = TestModel(3, 5, "Which event triggered the start of World War I?",
            listOf(
                OptionModel("Assassination of Archduke Franz Ferdinand",
                        "Bombing of Pearl Harbor",
                        "Signing of the Treaty of Versailles",
                    "Fall of the Berlin Wall",
                "Battle of Stalingrad", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design", 10)

        testList.add(question35)

        val question36 = TestModel(3, 6, " Which country was the first to land a man on the moon?",
            listOf(
                OptionModel("United States",
                        "Russia",
                        "China",
                    "Germany",
                "France", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question36)

        val question37 = TestModel(3, 7, "Who was the famous civil rights leader who gave the \"I Have a Dream\" speech?",
            listOf(
                OptionModel("Martin Luther King Jr.",
                        "Nelson Mandela",
                        "Mahatma Gandhi",
                    "Malcolm X",
        "Rosa Parks", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question37)

        val question38 = TestModel(3, 8, "UI UX Design ?",
            listOf(
                OptionModel("8xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question38)

        val question39 = TestModel(3, 9, "UI UX Design ?",
            listOf(
                OptionModel("9xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question39)

        val question310 = TestModel(3, 10, "UI UX Design ?",
            listOf(
                OptionModel("10xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "UI UX Design@", 10)

        testList.add(question310)

        //quiz4
        val question41 = TestModel(4, 1, "What is the meaning of UI UX Design ?",
            listOf(
                OptionModel("User Interfoce and User Experience_1", "User Introface and User Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 1, "Biology Quiz", 10)

        testList.add(question41)

        val question42 = TestModel(4, 2, "UI UX Design ?",
            listOf(
                OptionModel("xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question42)

        val question43 = TestModel(4, 3, "UI UX Design ?",
            listOf(
                OptionModel("3xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question43)

        val question44 = TestModel(4, 4, "UI UX Design ?",
            listOf(
                OptionModel("4xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question44)

        val question45 = TestModel(4, 5, "UI UX Design ?",
            listOf(
                OptionModel("5xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question45)

        val question46 = TestModel(4, 6, "UI UX Design ?",
            listOf(
                OptionModel("6xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question46)

        val question47 = TestModel(4, 7, "UI UX Design ?",
            listOf(
                OptionModel("7xperi2ence_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question47)

        val question48 = TestModel(4, 8, "UI UX Design ?",
            listOf(
                OptionModel("8xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question48)

        val question49 = TestModel(4, 9, "UI UX Design ?",
            listOf(
                OptionModel("9xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question49)

        val question410 = TestModel(4, 10, "UI UX Design ?",
            listOf(
                OptionModel("10xperience_1", "Experience_2",
                    "User Interfice and Using Experience_3", "User Interface and User Experience_4",
                    "Using Interface and Using Experience_5", 1, 2, 3, 4, 5)
            ), 2, "Biology Quiz", 10)

        testList.add(question410)

        return testList
    }
}