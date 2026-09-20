fun main() {
    val pratos = listOf("Pizza", "Hambúrguer", "Sushi", "Salada")
    val itemEsgotado = "Pizza"

    for (item in pratos) {
        if (item == itemEsgotado) {
            continue
        }

        println("Item disponível: $item")
    }
}
