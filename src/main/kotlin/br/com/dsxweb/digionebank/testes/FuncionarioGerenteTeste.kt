package br.com.dsxweb.digionebank.testes

import br.com.dsxweb.digionebank.Gerente


fun main() {
//    var dario = Pessoa(nome = "Dario Salles", cpf = "325.659.728-90")
//
//    println(dario.nome)
//    println(dario.cpf)

    val maria = Gerente("Maria do Carmo", "325.547.876-00", 5000.0)
//    println(joao.nome)
//    println(joao.cpf)
//    println(joao.salario)

    ImprimeRelatorioFuncionario.imprime(maria)

}