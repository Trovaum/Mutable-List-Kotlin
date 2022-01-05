package br.digitalinnovationone

fun main() {
    val funcionario1 = Funcionario("Ricardo ", 5000.0, " CLT")
    val funcionario2 = Funcionario("Renan ", 6500.0, " PJ")
    val funcionario3 = Funcionario("Enzo ", 2500.0, " CLT")

    val mRepositorio = Repositorio<Funcionario>()
    mRepositorio.create(funcionario1.nome, funcionario1)
    mRepositorio.create(funcionario2.nome, funcionario2)
    mRepositorio.create(funcionario3.nome, funcionario3)

    println("MutableMap busca por id: " + mRepositorio.findById(funcionario1.nome))
    mRepositorio.findAll().forEach { println("Mutable Map busca por todos: " + it) }

    println("MutableMap remove por id: " + mRepositorio.remove(funcionario1.nome))
    mRepositorio.findAll().forEach { println("Mutable Map lista sem item removido: " + it) }

}