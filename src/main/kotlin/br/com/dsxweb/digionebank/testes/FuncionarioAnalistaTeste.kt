package br.com.dsxweb.digionebank.testes

import br.com.dsxweb.digionebank.Analista
import br.com.dsxweb.digionebank.Funcionario
import br.com.dsxweb.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
//    var dario = Pessoa(nome = "Dario Salles", cpf = "325.659.728-90")
//
//    println(dario.nome)
//    println(dario.cpf)

    val joao = Analista("João da Silva", "325.547.587-89", 2000.0)
//    println(joao.nome)
//    println(joao.cpf)
//    println(joao.salario)

    ImprimeRelatorioFuncionario.imprime(joao)

}