package com.example.hellotoast

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonSwitchPage = findViewById<Button>(R.id.button_switchpage)

        buttonCountUp.setOnClickListener {
            mCount++
            Log.d("MainActivity", "mCount=$mCount")
            mShowCount.text = mCount.toString()
        }

        buttonToast.setOnClickListener {
            val tulisan = mShowCount.text.toString()
            Toast.makeText(this, getString(R.string.toast_message, tulisan), Toast.LENGTH_LONG).show()
        }

        buttonSwitchPage.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
