# Belajar Android Studio Empty Activity

## Cara Mencoba Kode Ini

Untuk mencoba kode ini, diperlukan Android Studio.

download folder project.

Selanjutnya, buka project tersebut dengan Android Studio dan jalankan.

## Pendahuluan

Kali ini, kita akan belajar membuat empty activity dengan Android Studio.

Empty activity adalah pilihan template project yang secara default memiliki sebuah layout kosong dengan TextView bertuliskan "Hello World".

Pilihan ini cukup fleksibel karena bisa dimodifikasi menjadi banyak pilihan.

## Langkah-Langkah Pembuatannya

![ScreenShot](assets/buat-project-0.png?raw=true)

![ScreenShot](assets/buat-project-1.png?raw=true)

![ScreenShot](assets/buat-project-2.png?raw=true)

## Penjelasan

Untuk penjelasannya, baca komentar dari kode.

Perlu diketahui bahwa di Electron, "//" atau "/* ... */" adalah komentar.

Kode yang ada di dalam komentar tidak akan dieksekusi.

### File activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <!-- menempatkan TextView dengan teks "Hello World!" -->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### File MainActivity.kt

```
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
```