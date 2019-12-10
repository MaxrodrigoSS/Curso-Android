package com.maxrodrigoss.listadeprodutos

class Conta(
    val nomeDaPessoa: String,
    val listaDeProdutos: ArrayList<Produto> = arrayListOf()
) {

    fun adicionarProdutoNaConta(produto: Produto) {
        listaDeProdutos.add(produto)
    }

    fun calcularTotalDaConta(): Float {
        return
    }
}