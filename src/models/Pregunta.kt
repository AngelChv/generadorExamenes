package models

class Pregunta<T>(var enunciado: String, var dificultad: Dificultad, var solucion: T) {
    fun esCorrecta(respuesta: String): Boolean {
        return try {
            when (solucion) {
                is String, is Boolean, is Number -> solucion.toString().lowercase() == respuesta.lowercase()
                is Test -> solucion == Test.valueOf(respuesta.uppercase())
                else -> false
            }
        } catch (e: Exception) {
            false
        }
    }
}