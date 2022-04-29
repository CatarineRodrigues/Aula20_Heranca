package Heranca.Exerc1

class ContaSalario(
    nomeTitular: String,
    tipoDeConta: String,
    saldo: Double
) : SistemaBancario(
    nomeTitular,
    tipoDeConta,
    saldo
) {
    fun tipoContaSalario(){
        mostrarConta()
    }
    fun contaSalarioSaldo(){
        mostrarSaldo()
    }


}
/* sistema bancário
criar conta salario, poupança ou corrente -> se tanto faz, essas são filhas
fazer função mostrar o tipo da conta
fun saldo
fun nome pessoa

criar objeto para rodar a conta
*/