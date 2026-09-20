fun main() {
    val numero = 6
    var fatorial = 1
    var contador = numero

    if (numero == 0 || numero == 1) {
        fatorial = 1

    } else if (numero > 1) {
        while (contador >= 1) {
            fatorial *= contador
            contador--
        }
    }

    println("Fatorial de $numero: $fatorial")
}
