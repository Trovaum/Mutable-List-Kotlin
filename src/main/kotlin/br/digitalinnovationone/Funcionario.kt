package br.digitalinnovationone

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
){
    override fun toString(): String {
        return "(nome='$nome', salario=$salario, tipo='$tipo')"
    }
}
