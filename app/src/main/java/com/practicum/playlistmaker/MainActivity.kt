package com.practicum.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSearch = findViewById<Button>(R.id.button_search)
        val buttonLibrary = findViewById<Button>(R.id.button_library)
        val buttonSettings = findViewById<Button>(R.id.button_settings)
//
//        buttonSearch.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Отправляемся искать музыку!", Toast.LENGTH_SHORT).show()
//        }
//
//        buttonLibrary.setOnClickListener {
//            Toast.makeText(this@MainActivity, "Танцуют все!", Toast.LENGTH_SHORT).show()
//        }

        buttonSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

//       buttonSettings.setOnClickListener {
//           Toast.makeText(this@MainActivity, "Настроим инструменты!", Toast.LENGTH_SHORT).show()
//        }

//       val clickOnbuttonSettings: View.OnClickListener = object : View.OnClickListener {
//           override fun onClick(v: View?) {
//               Toast.makeText(this@MainActivity, "Настроим инструменты!", Toast.LENGTH_SHORT).show()
//           }
//       }
//
//        buttonSettings.setOnClickListener(clickOnbuttonSettings)

    }
}