package com.example.lesson_androidintroduction_1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
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

        // Создание текстового элемента UI в коде в виде объекта со ссылкой на xml элемент
        val textView: TextView = findViewById<TextView>(R.id.textView)
        val helloWorld = findViewById<TextView>(R.id.helloWorld)

        // Создание кнопки
        val button = findViewById<Button>(R.id.button)

        // Создание изображения
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Взаимодействие с текстовым элементом — изменение текста
        textView.text = "Новый текст"

        // Взаимодействие с текстовым элементом — нажатие на текст
        textView.setOnClickListener { // Слущатель нажатий
            textView.text = "тскет йывоН"
        }

        // Нажатие на кнопку
        button.setOnClickListener {
            button.text = "Вы нажали на кнопку!"
        }

        var change = true

        // Нажатие на картинку
        imageView.setOnClickListener {
            // Смена картинки

            if (change) {
                imageView.setImageResource(R.drawable.cat_with_tears_of_joy)
                change = false
            } else {
                imageView.setImageResource(R.drawable.ac4db44e951664df88ea715ff9b5d462)
                change = true
            }
        }
    }
}