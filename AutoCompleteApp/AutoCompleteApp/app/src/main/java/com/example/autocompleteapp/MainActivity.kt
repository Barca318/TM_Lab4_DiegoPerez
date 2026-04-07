package com.example.autocompleteapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val presidents = arrayOf(
        "José Luis Bustamante",
        "Zenón Noriega",
        "Manuel Odría",
        "Manuel Prado",
        "Fernando Belaunde",
        "Alberto Fujimori",
        "Valentín Paniagua",
        "Alejandro Toledo",
        "Alan García",
        "Pedro Pablo Kuczynski",
        "Martín Vizcarra",
        "Pedro Castillo",
        "Dina Boluarte"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<AutoCompleteTextView>(R.id.txtPresidentes)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            presidents
        )

        textView.threshold = 3 // aparece después de 3 letras
        textView.setAdapter(adapter)
    }
}