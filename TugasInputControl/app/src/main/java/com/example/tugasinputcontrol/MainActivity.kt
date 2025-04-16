package com.example.tugasinputcontrol

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val MasukTelepon = findViewById<EditText>(R.id.etphoneNumber)
        val button = findViewById<Button>(R.id.button_main)

        button.setOnClickListener {
            val phone = MasukTelepon.text.toString().trim()

            if (isValidPhoneNumber(phone)) {
                Toast.makeText(this, "Nomor valid: $phone", Toast.LENGTH_SHORT).show()
            } else {
                MasukTelepon.error = "Nomor telepon tidak valid"
            }
        }
    }

    private fun isValidPhoneNumber(phone: String): Boolean {
        return phone.matches(Regex("^\\+?[0-9]{10,15}$"))
    }


}