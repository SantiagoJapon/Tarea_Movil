class Perro(nombre: String, edad: Int, val raza: String) : Animal(nombre, edad) {
    // Sobrescribe el método hacerSonido para reflejar el ladrido del perro
    override fun hacerSonido() {
        println("El perro $nombre hace ¡Guau!")
    }
}