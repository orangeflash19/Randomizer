package com.example.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollButton = findViewById<Button>(R.id.RollButton)
        val ResultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        RollButton.setOnClickListener {
            val rand = Random.nextInt(seekBar.progress) + 1
            ResultsTextView.text = rand.toString()
        }
    }
}
