package com.koushikjoshi.lessonist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signInBtn : Button = findViewById(R.id.signInButton)

        signInBtn.setOnClickListener {

            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

    }
}