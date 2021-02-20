package br.com.dsxweb.digionebank.testes

import br.com.dsxweb.digionebank.Banco

fun main() {

    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco 2", numero = 14)

    println(banco2.nome)
    println(banco2.numero)
}