package com.maxrodrigoss.olimpiadasdeesp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar_pong.*

class PlacarPong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_pong)


        pontosT1PP.text= "0"
        pontosT2PP.text= "0"

        conteinerT1.setOnClickListener {
            val valorInicial = pontosT1PP.text.toString()

           val valorNovo = valorInicial.toInt() + 1

            pontosT1PP.text = valorNovo.toString()

        }
        conteinerT2.setOnClickListener {
            val valorInicial = pontosT2PP.text.toString()
            val valorNovo = valorInicial.toInt() + 1

            pontosT2PP.text= valorNovo.toString()

        }

    }
}
