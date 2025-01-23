package com.example.quickutility

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import androidx.navigation.ui.AppBarConfiguration
import com.example.quickutility.R.id.*
import com.example.quickutility.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_fragment)

        val imageButton: ImageButton = findViewById(CalculatorButton)
        val imageButton2: ImageButton = findViewById(CalendarButton)
        val imageButton3: ImageButton = findViewById(ConverterButton)

        imageButton.setOnClickListener {
            val intent = Intent(this, CalcActivity::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener{
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener{
            val intent = Intent(this, ConverterActivity::class.java)
            startActivity(intent)
        }
    }
}