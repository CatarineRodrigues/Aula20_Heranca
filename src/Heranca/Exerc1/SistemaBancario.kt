package Heranca.Exerc1

open class SistemaBancario(
    var nomeTitular: String,
    var tipoDeConta: String,
    var saldo: Double
) {
    protected fun mostrarConta(){
        println("O tipo da conta de $nomeTitular é $tipoDeConta")
    }
    protected fun mostrarSaldo(){
        println("A $tipoDeConta de $nomeTitular possui o saldo de R$ $saldo")
    }

    fun nomeTitular(){
        println("O nome do titular da conta é $nomeTitular")

    }

}