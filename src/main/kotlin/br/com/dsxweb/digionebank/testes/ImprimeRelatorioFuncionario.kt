package br.com.dsxweb.digionebank.testes

import br.com.dsxweb.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}