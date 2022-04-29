package Heranca

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

class Peixe(
    nomeAnimal: String, especie: String, tipoAlimentacao: String,
    cor: String, tamanho: String,
    idade: Int, peso: Double, pessoaTutora: PessoaTutora,
    tipoDeAgua: String
) : Animal(
    nomeAnimal, especie, tipoAlimentacao,
    cor, tamanho,
    idade, peso, pessoaTutora
) {}


class PessoaTutora(val nome: String, val email: String) {}

fun main() {
    /*Aula de herança e composição*/

    val jessica: PessoaTutora = PessoaTutora("Jessica", "email2@email.com")
    val mingau: Gato = Gato(
        "mingau", "gato", "ração",
        "branco", "pequeno",
        1, 4.0, jessica, "macia"
    )
}
