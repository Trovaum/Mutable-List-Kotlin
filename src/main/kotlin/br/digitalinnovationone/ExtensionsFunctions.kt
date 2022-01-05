package br.digitalinnovationone

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(), "1500".toBigDecimal(), "4000".toBigDecimal())

    println("Retorna o total: " + salarios.somatoria())
    println("Retorna a media: " + salarios.media())
}