package br.com.dsxweb.digionebank.testes

import br.com.dsxweb.digionebank.Pessoa

fun main() {
    var dario = Pessoa(nome = "Dario Salles", cpf = "325.659.728-90")

    println(dario.nome)
    println(dario.cpf)
    //println(dario.Endereco().rua)
}