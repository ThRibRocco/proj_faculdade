package com.mercadolivre.calculo_desconto_auladvm
package com.mercadolivre.calculo_desconto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entrada: EditText
        val saida: EditText
        val calcular: Butto
        val reset: Button

        entrada = findViewById<View>(R.id.valorEntrada) as EditText
        saida = findViewById<View>(R.id.valorSaida) as EditText
        subtracao = findViewById<View>(R.id.subtracao) as Button


        subtracao.setOnClickListener {
            val string = entrada.text.toString()
            val moeda = string.toInt()
            val i = moeda - 5
            val decimal = i.toString()
            saida.setText(decimal)
        }
        reset.setOnClickListener{
            val reset = null
            entrada.setText(reset)
            saida.setText(reset)

        }
    }
}