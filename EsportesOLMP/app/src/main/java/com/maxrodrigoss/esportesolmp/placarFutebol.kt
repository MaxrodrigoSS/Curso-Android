package com.maxrodrigoss.esportesolmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar_futebol.*

class placarFutebol : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_futebol)

        pontosFL1.text = "0"
        pontosFL2.text="0"

        container1.setOnClickListener {
            val valorInicial = pontosFL1.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosFL1.text = novoValor.toString()
        }

        container2.setOnClickListener {
            val valorInicial = pontosFL2.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosFL2.text = novoValor.toString()
        }

        menosT1FL.setOnClickListener {
            val valorInicial = pontosFL1.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosFL1.text = novoValor.toString()
        }

        menosT2FL.setOnClickListener {
            val valorInicial = pontosFL2.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosFL2.text = novoValor.toString()
        }

        zerarBtn.setOnClickListener {
            pontosFL1.text = "0"
            pontosFL2.text = "0"
        }
    }
}
