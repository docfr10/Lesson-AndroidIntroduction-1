package com.example.lesson_androidintroduction_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Класс MainActivity представляет собой начальный экран приложения
class MainActivity : AppCompatActivity() {
    // С метода onCreate стартует проект
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Включает поддержку для наполнения элементами UI на всем экране
        enableEdgeToEdge()

        // Определяет то, какой интерфейс будет на экране
        setContentView(R.layout.activity_main)

        // Поддержка того, чтобы элементы не уходили за пределы экрана
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}