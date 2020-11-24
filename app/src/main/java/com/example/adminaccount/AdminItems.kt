package com.example.adminaccount

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AdminItems : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_items)

        val adminHomeBtn: ImageButton = findViewById(R.id.adminHomeBtn2)
        adminHomeBtn.setOnClickListener{
            val intent = Intent(this, AdminHome::class.java )
            startActivity(intent)
        }

        val adminItemsBtn: ImageButton = findViewById(R.id.adminItemsBtn2)
        adminItemsBtn.setOnClickListener {
            val intent = Intent(this, AdminItems::class.java )
            startActivity(intent)
        }

        val adminProfileBtn: ImageButton = findViewById(R.id.adminProfileBtn2)
        adminProfileBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }

        val adminTaskBtn: ImageButton = findViewById(R.id.adminTaskBtn2)
        adminTaskBtn.setOnClickListener {
            val intent = Intent(this, OrderList::class.java )
            startActivity(intent)
        }

        val allVegeBtn: Button = findViewById(R.id.allVege)
        allVegeBtn.setOnClickListener {
            val intent = Intent(this, AllVegetables::class.java )
            startActivity(intent)
        }

        val allFruitBtn: Button = findViewById(R.id.allFruit)
        allFruitBtn.setOnClickListener {
            val intent = Intent(this, AllFruits::class.java )
            startActivity(intent)
        }

        val allChickenBtn: Button = findViewById(R.id.allChicken)
        allChickenBtn.setOnClickListener {
            val intent = Intent(this, AllChickens::class.java )
            startActivity(intent)
        }

        val allEggBtn: Button = findViewById(R.id.allEgg)
        allEggBtn.setOnClickListener {
            val intent = Intent(this, AllEggs::class.java )
            startActivity(intent)
        }

        val allSeafoodBtn: Button = findViewById(R.id.allSeafood)
        allSeafoodBtn.setOnClickListener {
            val intent = Intent(this, AllSeafoods::class.java )
            startActivity(intent)
        }



    }
}