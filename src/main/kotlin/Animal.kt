open class Animal(val nombre: String, val edad: Int) {
    // Método común a todos los animales
    open fun hacerSonido() {
        println("El animal hace un sonido genérico.")
    }
}