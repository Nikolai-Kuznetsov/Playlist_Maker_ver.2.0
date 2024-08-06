package com.practicum.playlistmaker

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backButton = findViewById<Toolbar>(R.id.settings_header)
        val shareAppButton = findViewById<LinearLayout>(R.id.share_app)
        val supportButton = findViewById<LinearLayout>(R.id.email_for_support)
        val termsOfUseButton = findViewById<LinearLayout>(R.id.terms_of_use)

        backButton.setNavigationOnClickListener {
            finish()
        }


        shareAppButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, getString(R.string.share_app_url))
            }
            try {
                startActivity(Intent.createChooser(shareIntent, getString(R.string.messenger_success)))
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, getString(R.string.no_messenger), Toast.LENGTH_LONG).show()
            }
        }


        supportButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:${getString(R.string.email_address)}")
                putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject))
                putExtra(Intent.EXTRA_TEXT, getString(R.string.email_body))
            }
            try {
                startActivity(emailIntent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, getString(R.string.no_email_client), Toast.LENGTH_LONG).show()
            }
        }


        termsOfUseButton.setOnClickListener {
            val termsOfUseIntent = Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.terms_of_use_url)))
            try {
                startActivity(termsOfUseIntent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, getString(R.string.no_browser), Toast.LENGTH_LONG).show()
            }
        }
    }
}
