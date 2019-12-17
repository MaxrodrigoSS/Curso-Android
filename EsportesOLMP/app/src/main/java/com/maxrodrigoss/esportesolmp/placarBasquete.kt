package com.maxrodrigoss.esportesolmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar_basquete.*

class placarBasquete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar_basquete)

        pontosBQ1.text="0"
        pontosBQ2.text="0"


        mais1T1BQ.setOnClickListener {
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosBQ1.text = novoValor.toString() }

        mais2T1BQ.setOnClickListener{
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() + 2
            pontosBQ1.text = novoValor.toString() }

        mais3T1BQ.setOnClickListener {
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() + 3
            pontosBQ1.text = novoValor.toString() }

        menos1T1BQ.setOnClickListener {
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosBQ1.text = novoValor.toString() }

        menos2T1BQ.setOnClickListener {
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() - 2
            pontosBQ1.text = novoValor.toString() }

        menos3T1BQ.setOnClickListener {
            val valorInicial = pontosBQ1.text.toString()
            val novoValor = valorInicial.toInt() - 3
            pontosBQ1.text = novoValor.toString() }


        zerarBtn.setOnClickListener {
            pontosBQ1.text = "0"
            pontosBQ2.text = "0" }


        mais1T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() + 1
            pontosBQ2.text = novoValor.toString() }

        mais2T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() + 2
            pontosBQ2.text = novoValor.toString() }

        mais3T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() + 2
            pontosBQ2.text = novoValor.toString() }

        menos1T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() - 1
            pontosBQ2.text = novoValor.toString() }

        menos2T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() - 2
            pontosBQ2.text = novoValor.toString() }

        menos3T2BQ.setOnClickListener {
            val valorInicial = pontosBQ2.text.toString()
            val novoValor = valorInicial.toInt() - 3
            pontosBQ2.text = novoValor.toString() }

    }
}
