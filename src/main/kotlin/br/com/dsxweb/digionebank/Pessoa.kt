package br.com.dsxweb.digionebank

class Pessoa {
    var nome: String = "Dario"
    var cpf: String = "325.659.728-90"

            inner class Endereco {
                var rua: String = "R. Dulio Sávio, 80"
            }
}

fun main() {
    var dario = Pessoa()

    println(dario.nome)
    println(dario.cpf)
    println(dario.Endereco().rua)
}