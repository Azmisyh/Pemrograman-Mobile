package com.example.drakorlist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.drakorlist.LoginActivity
import com.example.drakorlist.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var etRegUsername: EditText
    private lateinit var etRegPassword: EditText
    private lateinit var etConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etRegUsername = findViewById(R.id.edtUsername)
        etRegPassword = findViewById(R.id.edtPassword)
        etConfirmPassword = findViewById(R.id.edtConfirmPassword)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)

        btnDaftar.setOnClickListener {
            val user = etRegUsername.text.toString()
            val pass = etRegPassword.text.toString()
            val confirm = etConfirmPassword.text.toString()

            if (user.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                Toast.makeText(this, "Di Isi Semua Field Nya", Toast.LENGTH_SHORT).show()
            } else if (pass != confirm) {
                Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("username", user)
                intent.putExtra("password", pass)
                Toast.makeText(this, "Registrasi Telah berhasil", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
            }
        }
    }
}