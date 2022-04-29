package Heranca.Exerc1

class ContaCorrente(
    nomeTitular: String,
    tipoDeConta: String,
    saldo: Double
) : SistemaBancario(
    nomeTitular,
    tipoDeConta,
    saldo
) {
    fun tipoContaCorrente() {
        mostrarConta()
    }

    fun contaCorrenteSaldo() {
        mostrarSaldo()

    }
}