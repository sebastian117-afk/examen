package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAgregar.setOnClickListener(){
            val usuario = binding.edit1.text.toString()
            val contra = binding.edit2.text.toString()

            val persona = ArrayList<Persona>()
            persona.add(Persona("sebastian","Choco"))

            val n = persona[0].nombre
            val a = persona[0].apellidos
            val intent3 = Intent(this,MainActivityBienvenida2::class.java)
            if (usuario == "sebas" && contra == "12345"){
                intent3.putExtra("nombre",n)
                intent3.putExtra("apellido",a)
                startActivity(intent3)
            } else {
                Toast.makeText(this,"Usuario o contraseña invalida",Toast.LENGTH_SHORT).show()
            }
        }




    }
}