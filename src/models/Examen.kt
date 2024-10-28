package models

class Examen(private val preguntas: Collection<Pregunta<*>>) {
    fun realizar() {
        var puntos = 0
        preguntas.forEach { pregunta ->
            var respuesta: String? = null
            while (respuesta.isNullOrBlank()) {
                println(pregunta.enunciado)
                respuesta = readlnOrNull()
            }
            if (pregunta.esCorrecta(respuesta)) {
                println("Correcto!")
                puntos++
            } else println("Incorrecto")
        }

        // Mostrar la nota con dos decimales
        println("Tu nota es: %.2f".format(puntos.toDouble() / preguntas.size * 10))
    }
}

