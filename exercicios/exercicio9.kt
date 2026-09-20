fun main() {
    val tarefas = listOf(
        "Estudar Kotlin",
        "Fazer exercícios",
        "Comprar pão",
        "Limpar casa"
    )

    var numero = 1

    for (tarefa in tarefas) {
        println("Tarefa $numero: $tarefa")
        numero++
    }
}
