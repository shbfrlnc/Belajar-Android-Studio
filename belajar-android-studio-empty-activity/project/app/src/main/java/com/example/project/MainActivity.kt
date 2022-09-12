package com.example.project

// import modules
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// class yang mengatur layout activity_main
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set activity_main sebagai content
        setContentView(R.layout.activity_main)
    }
}