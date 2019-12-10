import com.maxrodrigoss.listadeprodutos.Conta
import com.maxrodrigoss.listadeprodutos.Produto

'package com.maxrodrigoss.listadeprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_main)


        val produto1 = Produto(
            nome = "Cerveja",
            valorUnitario = 7f,
            quantidade = 5)

        val totalGastoComCerveja = produto1.calcularValorTotalDoItem()

        var totalConta = totalGastoComCerveja.toFloat()

        val conta = Conta("Junior")
    }
}
