package com.example.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnkembali = findViewById<Button>(R.id.rdaftar)
        btnkembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val rnama = findViewById<EditText>(R.id.rnama)
        val rpass = findViewById<EditText>(R.id.rpassword)
        val buttonHapus = findViewById<Button>(R.id.hapus)

        buttonHapus.setOnClickListener {
            rnama.setText("")
            rpass.setText("")
        }
    }
}