package com.maxrodrigoSS.voleiplacar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pontuacao1.text = "0"
        pontuacao2.text = "0"


        container1.setOnClickListener {
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1

            pontuacao1.text = novoValor.toString()
        }



        container2.setOnClickListener {
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() + 1

            pontuacao2.text = novoValor.toString()
        }





        menosTime1Btn.setOnClickListener {
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() - 1

            pontuacao1.text = novoValor.toString()
        }

        menosTime2Btn.setOnClickListener {
            val valorInicial = pontuacao2.text.toString()
            val novoValor = valorInicial.toInt() - 1

            pontuacao2.text = novoValor.toString()
        }





        zerarBtn.setOnClickListener {
            pontuacao1.text = "0"
            pontuacao2.text = "0"
        }



        if(pontuacao1 <= -1 ){
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1

            pontuacao1.text = novoValor.toString()
        }

        if(pontuacao2 <= -1 ){
            val valorInicial = pontuacao1.text.toString()
            val novoValor = valorInicial.toInt() + 1

            pontuacao2.text = novoValor.toString()
        }

    }

}
