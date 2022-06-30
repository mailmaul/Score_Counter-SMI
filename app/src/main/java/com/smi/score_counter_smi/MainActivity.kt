package com.smi.score_counter_smi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            val angka = findViewById(R.id.angka) as TextView
            angka.text = it.toString()

        })

        viewModel.currentBoolean.observe(this, Observer {
            val boolangka = findViewById(R.id.booleanangka) as TextView
            boolangka.text = it.toString()

        })

        incrementText()
        decrementText()
    }

    private fun incrementText () {
        val btn_increment = findViewById(R.id.btn_increment) as Button
        btn_increment.setOnClickListener{
            viewModel.currentNumber.value = ++viewModel.number
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
        }
    }

    private fun decrementText () {
        val btn_decrement = findViewById(R.id.btn_decrement) as Button
        btn_decrement.setOnClickListener{
            viewModel.currentNumber.value = --viewModel.number
            viewModel.currentBoolean.value = viewModel.number % 2 == 0
        }
    }
}