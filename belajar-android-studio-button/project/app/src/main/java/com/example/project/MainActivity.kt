package com.example.project

// import modules
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// class yang mengatur layout activity_main
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // set activity_main sebagai content
        setContentView(R.layout.activity_main)

        // mendapatkan referensi ke text view dengan id textView
        val textView = findViewById<TextView>(R.id.textView)

        // mendapatkan referensi ke button dengan id btnClickMe
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        // mendengarkan event on click
        btnClickMe.setOnClickListener{
            // saat menerima event on click...

            //ubah teks "Hello World!" menjadi "Button clicked"
            textView.text = "Button clicked"
        }
    }
}