# Belajar Android Studio Button

## Cara Mencoba Kode Ini

Untuk mencoba kode ini, diperlukan Android Studio.

download folder project.

Selanjutnya, buka project tersebut dengan Android Studio dan jalankan.

## Pendahuluan

Button adalah salah satu komponen dalam aplikasi Android yang bisa men-trigger event on click.

Dengan event tersebut, kita bisa menjalankan prosedur tertentu saat tombol diklik.

Dalam project ini, kita akan menggunakan button untuk mengubah teks di layar Android dari yang tadinya "Hello World!" menjadi "Button clicked".

## Penjelasan

### File activity_main.xml

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <!-- menempatkan TextView dengan teks awal "Hello World!" -->
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <!-- menempatkan Button dengan teks "Click Me" -->
    <Button
        android:id="@+id/btnClickMe"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me"
        app:layout_constraintBottom_toTopOf="@+id/textView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.892" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### File MainActivity.kt

```
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
```