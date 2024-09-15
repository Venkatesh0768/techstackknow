package com.example.techstackknow

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.Manifest



class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondpage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btncard1 = findViewById<CardView>(R.id.btncard1)
        val btncard2 = findViewById<CardView>(R.id.btncard2)
        val btncard3 = findViewById<CardView>(R.id.btncard3)
        val btncard4 = findViewById<CardView>(R.id.btncard4)
        val btncard5 = findViewById<CardView>(R.id.btncard5)
        val btncard6 = findViewById<CardView>(R.id.btncard6)

        val btnsupport = findViewById<Button>(R.id.btnsupport)

        btncard1.setOnClickListener {
            intent = Intent(applicationContext, appdevelopmet::class.java)
            startActivity(intent)
        }

        btncard2.setOnClickListener {
            intent = Intent(applicationContext, javadevelopment::class.java)
            startActivity(intent)
        }

        btncard3.setOnClickListener {
            intent = Intent(applicationContext, webdevelpment::class.java)
            startActivity(intent)
        }

        btncard4.setOnClickListener {
            intent = Intent(applicationContext, gamedeveloper::class.java)
            startActivity(intent)
        }

        btncard5.setOnClickListener {
            intent = Intent(applicationContext, flutterdeveloper::class.java)
            startActivity(intent)
        }
        btncard6.setOnClickListener {
            intent = Intent(applicationContext, almldeveloper::class.java)
            startActivity(intent)
        }


        btnsupport.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "2203051050616"))
            startActivity(intent)
        }


    }
}