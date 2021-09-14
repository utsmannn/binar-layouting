package com.binar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    private val tvHelloWord: TextView by lazy {
        findViewById(R.id.tv_hello_word)
    }

    private val btnChangeText: Button by lazy {
        findViewById(R.id.btn_change_text)
    }

    private val imageView: ImageButton by lazy {
        findViewById(R.id.img_view_hello)
    }

    private val toggleButton: SwitchCompat by lazy {
        findViewById(R.id.toggle_btn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHelloWord.text = "Hello word"
        imageView.setImageResource(R.drawable.kucing1)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            tvHelloWord.text = isChecked.toString()
        }

        btnChangeText.isEnabled = false

        btnChangeText.setOnClickListener {
            tvHelloWord.text = "hello from button"
            imageView.setImageResource(R.drawable.kucing2)
        }


    }
}