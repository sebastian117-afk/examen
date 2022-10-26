package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen.databinding.ActivityMainBienvenida2Binding

class MainActivityBienvenida2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBienvenida2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBienvenida2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val parExtra = intent.extras
        val n = parExtra?.getString("nombre")
        val a = parExtra?.getString("apellido")
        binding.textView2.text = n.toString()
        binding.textView3.text = a.toString()

        binding.button.setOnClickListener(){
            val inento1 = Intent(this,MainActivity::class.java)
            startActivity(inento1)
        }
    }
}