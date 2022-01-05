package br.digitalinnovationone

fun main() {
    val funcionario1 = Funcionario("Ricardo ", 5000.0, " CLT")
    val funcionario2 = Funcionario("Renan ", 6500.0, " PJ")
    val funcionario3 = Funcionario("Enzo ", 2500.0, " CLT")

    val funcionarios = mutableListOf(funcionario1, funcionario2, funcionario3)
    funcionarios.forEach { println("Mutable List: " + it) }

    funcionarios.add(funcionario3)
    funcionarios.forEach { println("Mutable List Add: " + it) }

    funcionarios.remove(funcionario3)
    funcionarios.forEach { println("Mutable List Remove: " + it) }

    val setFuncionarios = mutableSetOf(funcionario1)
    setFuncionarios.forEach { println("Mutable Set: " + it) }

    setFuncionarios.add(funcionario2)
    setFuncionarios.add(funcionario3)
    setFuncionarios.forEach { println("Mutable Set Add: " + it) }

    setFuncionarios.remove(funcionario2)
    setFuncionarios.forEach { println("Mutable Set remove: " + it) }
}