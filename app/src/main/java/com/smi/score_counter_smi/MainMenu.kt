package com.smi.score_counter_smi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val main = findViewById(R.id.cv_main) as CardView
        val cs1 = findViewById(R.id.cv_cs1) as CardView
        val cs2 = findViewById(R.id.cv_cs2) as CardView
        val cs3 = findViewById(R.id.cv_cs3) as CardView

        main.setOnClickListener{
            Toast.makeText(applicationContext,"Score Counter",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainMenu, MainActivity::class.java))
        }

        cs1.setOnClickListener{
            Toast.makeText(applicationContext,"Coming Soon",Toast.LENGTH_SHORT).show()
        }

        cs2.setOnClickListener{
            Toast.makeText(applicationContext,"Coming Soon",Toast.LENGTH_SHORT).show()
        }

        cs3.setOnClickListener{
            Toast.makeText(applicationContext,"Coming Soon",Toast.LENGTH_SHORT).show()
        }
    }
}