package com.example.adminaccount

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adminHomeBtn:ImageButton = findViewById(R.id.adminHomeBtn1)
        adminHomeBtn.setOnClickListener{
            val intent = Intent(this, AdminHome::class.java )
            startActivity(intent)
        }

        val adminItemsBtn:ImageButton = findViewById(R.id.adminItemsBtn1)
        adminItemsBtn.setOnClickListener {
            val intent = Intent(this, AdminItems::class.java )
            startActivity(intent)

        }

        val adminTaskBtn: ImageButton = findViewById(R.id.adminTaskBtn1)
        adminTaskBtn.setOnClickListener {
            val intent = Intent(this, OrderList::class.java )
            startActivity(intent)
        }


    }
}

