package com.example.prueba1.MaxiQuiroz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var cuentaMesa: CuentaMesa

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemMenuPastel = ItemMenu("Pastel de Choclo", "$12000")
        val itemMenuCazuela = ItemMenu("Cazuela", "$10000")

        val pastel = 0
        val btnPastel = findViewById<TextView>(pastel)
        val cazuela = 0
        val btnCazuela = findViewById<TextView>(cazuela)
        val checkBoxPropina = findViewById<CheckBox>(R.id.checkBoxPropina)

        cuentaMesa = CuentaMesa(mesa = 1)

        btnPastel.setOnClickListener {
            cuentaMesa.agregarItem(itemMenuPastel, 1)
            showToast("Pastel de Choclo añadido")
        }

        btnCazuela.setOnClickListener {
            cuentaMesa.agregarItem(itemMenuCazuela, 1)
            showToast("Cazuela añadida")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}