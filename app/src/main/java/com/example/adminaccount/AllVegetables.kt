package com.example.adminaccount



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AllVegetables : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_vegetables)

        val adminHomeBtn: ImageButton = findViewById(R.id.vegeHomeBtn)
        adminHomeBtn.setOnClickListener{
            val intent = Intent(this, AdminHome::class.java )
            startActivity(intent)
        }

        val adminItemsBtn: ImageButton = findViewById(R.id.vegeItemsBtn)
        adminItemsBtn.setOnClickListener {
            val intent = Intent(this, AdminItems::class.java )
            startActivity(intent)
        }

        val adminProfileBtn: ImageButton = findViewById(R.id.vegeProfileBtn)
        adminProfileBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }

        val languages = resources.getStringArray(R.array.Languages)
        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    if(languages[position] != "Tap To Select") {
                        Toast.makeText(this@AllVegetables,
                                getString(R.string.selected_item) + " " +
                                        "" + languages[position], Toast.LENGTH_SHORT).show()
                    }

                    if(languages[position]=="Vegetables"){
                        startActivity(Intent(this@AllVegetables,AllVegetables::class.java))
                    }

                    if(languages[position]=="Fruits"){
                        startActivity(Intent(this@AllVegetables,AllFruits::class.java))
                    }

                    if(languages[position]=="Chickens"){
                        startActivity(Intent(this@AllVegetables,AllChickens::class.java))
                    }

                    if(languages[position]=="Eggs"){
                        startActivity(Intent(this@AllVegetables,AllEggs::class.java))
                    }

                    if(languages[position]=="Seafoods"){
                        startActivity(Intent(this@AllVegetables,AllSeafoods::class.java))
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}