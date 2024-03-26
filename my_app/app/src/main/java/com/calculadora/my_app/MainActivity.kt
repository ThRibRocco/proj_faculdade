package com.calculadora.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText
        val num2: EditText
        val saida: EditText
        val subtrai: Button
        val som: Button
        val mult: Button
        val div: Button

        num1 = findViewById<View>(R.id.valor1) as EditText
        num2 = findViewById<View>(R.id.valor2) as EditText
        saida = findViewById<View>(R.id.valorSaida) as EditText
        subtrai = findViewById<View>(R.id.subt) as Button
        som = findViewById<View>(R.id.som) as Button
        div = findViewById<View>(R.id.div) as Button
        mult = findViewById<View>(R.id.mult) as Button



        subtrai.setOnClickListener {
            val string = num1.text.toString()
            val string2 = num2.text.toString()
            val cara = string.toInt()
            val coroa = string2.toInt()
            val i = cara - coroa
            val decimal = i.toString()
            saida.setText(decimal)
        }
        som.setOnClickListener {
            val string = num1.text.toString()
            val string2 = num2.text.toString()
            val cara = string.toInt()
            val coroa = string2.toInt()
            val i = cara + coroa
            val decimal = i.toString()
            saida.setText(decimal)
        }
        mult.setOnClickListener {
            val string = num1.text.toString()
            val string2 = num2.text.toString()
            val cara = string.toInt()
            val coroa = string2.toInt()
            val i = cara * coroa
            val decimal = i.toString()
            saida.setText(decimal)
        }
        div.setOnClickListener {
            val string = num1.text.toString()
            val string2 = num2.text.toString()
            val cara = string.toInt()
            val coroa = string2.toInt()
            val i = cara / coroa
            val decimal = i.toString()
            saida.setText(decimal)
        }

    }
}


