import models.Examen
import models.Pregunta

fun main() {
    val examen = Examen(listOf(
        Pregunta(
            enunciado = "¿Cuál es el símbolo del oro en la tabla períodica?",
            dificultad = Pregunta.Dificultad.FACIL,
            solucion = "Au"
        ),
        Pregunta(
            enunciado = "¿Cuál es el animal más rápido del mundo?" +
                    "\nA. Leopardo." +
                    "\nB. Guepardo." +
                    "\nC. Pantera." +
                    "\nD. Puma.",
            dificultad = Pregunta.Dificultad.MEDIA,
            solucion = Pregunta.Test.B
        ),
        Pregunta(
            enunciado = "1 + 1 = 2 (true/false)",
            dificultad = Pregunta.Dificultad.FACIL,
            solucion = true
        ),
        Pregunta(
            enunciado = "2^10",
            dificultad = Pregunta.Dificultad.FACIL,
            solucion = 1024
        )
    ))
    examen.realizar()
}