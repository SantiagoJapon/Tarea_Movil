class Persona(val nombre: String, val edad: Int, val ocupacion: String) {
    fun obtenerDescripcion(): String {
        return "$nombre, $edad años, $ocupacion"
    }
}