package com.maxrodrigoss.esportesolmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_placar_volei.*

class placarVolei : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_volei)

        pontosT1VL.text = "0"
        pontosT2VL.text="0"

        container1.setOnClickListener {
            val valorInicial = pontosT1VL.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosT1VL.text = novoValor.toString()
        }

        container2.setOnClickListener {
            val valorInicial = pontosT2VL.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosT2VL.text = novoValor.toString()


        menosT1VL.setOnClickListener {
            val valorInicial = pontosT1VL.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosT1VL.text = novoValor.toString()
        }

        menosT2VL.setOnClickListener {
            val valorInicial = pontosT2VL.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosT2VL.text = novoValor.toString()
        }

        zerarBtn.setOnClickListener {
            pontosT1VL.text = "0"
            pontosT2VL.text = "0"
        }




    }
}
