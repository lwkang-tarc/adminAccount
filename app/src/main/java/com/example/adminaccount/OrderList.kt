package com.example.adminaccount

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class OrderList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_list)

        val adminHomeBtn: ImageButton = findViewById(R.id.listHomeBtn)
        adminHomeBtn.setOnClickListener{
            val intent = Intent(this, AdminHome::class.java )
            startActivity(intent)
        }


        val adminItemsBtn: ImageButton = findViewById(R.id.listItemsBtn)
        adminItemsBtn.setOnClickListener {
            val intent = Intent(this, AdminItems::class.java )
            startActivity(intent)
        }

        val adminProfileBtn: ImageButton = findViewById(R.id.listProfileBtn)
        adminProfileBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }

        val adminTaskBtn: ImageButton = findViewById(R.id.listTaskBtn)
        adminTaskBtn.setOnClickListener {
            val intent = Intent(this, OrderList::class.java )
            startActivity(intent)
        }

    }
}