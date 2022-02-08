package com.example.andoidxmltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitForm(view: View) {
        println("Submitting form")
        var eMail = findViewById<EditText>(R.id.text_field_email).text
        var password = findViewById<EditText>(R.id.text_field_password).text

        println("Email: $eMail Password: $password")
    }
}

