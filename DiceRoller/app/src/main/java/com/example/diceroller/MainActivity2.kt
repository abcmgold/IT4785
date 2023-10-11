package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dice.roll().toString()
    }
}

class Dice(private val numSideS: Int) {
    fun roll(): Int {
        return (1..numSideS).random()
    }
}