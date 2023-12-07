class Gato(nombre: String, edad: Int, val color: String) : Animal(nombre, edad) {
    // Sobrescribe el método hacerSonido para reflejar el maullido del gato
    override fun hacerSonido() {
        println("El gato $nombre hace ¡Miau!")
    }
}