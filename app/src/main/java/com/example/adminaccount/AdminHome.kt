package com.example.adminaccount

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AdminHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)

        val adminHomeBtn: ImageButton = findViewById(R.id.adminHomeBtn3)
        adminHomeBtn.setOnClickListener{
            val intent = Intent(this, AdminHome::class.java )
            startActivity(intent)
        }


        val adminItemsBtn:ImageButton = findViewById(R.id.adminItemsBtn3)
        adminItemsBtn.setOnClickListener {
            val intent = Intent(this, AdminItems::class.java )
            startActivity(intent)
        }

        val adminProfileBtn: ImageButton = findViewById(R.id.adminProfileBtn3)
        adminProfileBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }


    }
}