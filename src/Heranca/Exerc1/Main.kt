package Heranca.Exerc1

fun main() {
    var contaSalario: ContaSalario = ContaSalario(
        "Catarine", "Conta Salário",2000.00)
    var contaCorrente: ContaCorrente = ContaCorrente(
        "Catarine", "Conta Corrente",0.00)
    var contaPoupanca: ContaPoupanca = ContaPoupanca(
        "Catarine", "Conta Poupança",120.00)
    println("-------------------------")
    contaSalario.tipoContaSalario()
    contaSalario.contaSalarioSaldo()
    contaSalario.nomeTitular()
    println("-------------------------")
    contaCorrente.tipoContaCorrente()
    contaCorrente.contaCorrenteSaldo()
    contaCorrente.nomeTitular()
    println("-------------------------")
    contaPoupanca.tipoContaPoupanca()
    contaPoupanca.contaPoupancaSaldo()
    contaPoupanca.nomeTitular()
}


/* sistema bancário
criar conta salario, poupança ou corrente -> se tanto faz, essas são filhas
fazer função mostrar o tipo da conta
fun saldo
fun nome pessoa

criar objeto para rodar a conta
*/

/*
open class Animal(
    val nomeAnimal: String, val especie: String, val tipoAlimentacao: String,
    val cor: String, val tamanho: String,
    val idade: Int, val peso: Double, val pessoaTutora: PessoaTutora
) {}

class Gato(
    nomeAnimal: String, especie: String, tipoAlimentacao: String,
    cor: String, tamanho: String,
    idade: Int, peso: Double, pessoaTutora: PessoaTutora,
    pelagem: String
) : Animal(
    nomeAnimal, especie, tipoAlimentacao,
    cor, tamanho,
    idade, peso, pessoaTutora
) {}

*/