fun main() {
    val tamanho = 5

    for (linha in 0 until tamanho) {
        for (coluna in 0 until tamanho) {

            if (linha == coluna) {
                print("X ")
            } else {
                print("* ")
            }
        }

        println()
    }
}
