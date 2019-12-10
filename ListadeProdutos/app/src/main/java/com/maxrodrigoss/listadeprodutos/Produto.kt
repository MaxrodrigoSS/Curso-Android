package com.maxrodrigoss.listadeprodutos

class Produto(
    val nome: String,
    val valorUnitario: Float,
    var quantidade: Int) {

    fun calcularValorTotalDoItem(): Float = quantidade * valorUnitario
}

