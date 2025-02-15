package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes Edit Text
        //Criar uma variavel que link com o EditText
        // Recuperar o botao da tela
        // Colocar acao no botao setOnClickListener
        // Recuperar o text digitado no edtPeso

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura: Float = edtAltura.text.toString().toFloat()

            val alturaQ2= altura * altura
            val resultado = peso / alturaQ2

            println ("O seu calculo foi" + resultado)

        }
    }
}