package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.btnlogin.setOnClickListener {
            val usuario = "admin"
            val pass = "123"

            val txtUsuario = binding.txtUser.editText?.text.toString().trim()
            val txtPass = binding.txtPass.editText?.text.toString().trim()

            if (txtUsuario == usuario && txtPass == pass) {
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }

    }
}