package com.example.kidslearning.data.repository

import com.example.kidslearning.data.model.WelcomeMessage

class HomeRepository {
    fun getWelcomeMessage(): WelcomeMessage = WelcomeMessage(
        title = "Hello, Explorer!",
        subtitle = "Fun quizzes are coming soon."
    )
}