fun main(args: Array<String>) {

    //Main de la clase persona
    val pedro = Persona("Pedro", 20, "Estudiante")
    val juan = Persona("Juan", 40, "Abogado")
    val luis = Persona("Luis", 30, "Arquitecto")
    val emilio = Persona("Emilio", 20, "Futbolista")

    println(pedro.obtenerDescripcion())
    println(juan.obtenerDescripcion())
    println(luis.obtenerDescripcion())
    println(emilio.obtenerDescripcion())

    println("--------------------0---------------------------------")

    //Intancia de la clase animal

    val listaDeAnimales = listOf(
        Animal("AnimalGenérico", 3),
        Perro("Buddy", 2, "Labrador"),
        Gato("Whiskers", 4, "Blanco")
    )
    for (animal in listaDeAnimales) {
        animal.hacerSonido()
    }

    println("----------------------0-------------------------------")
    // Crear objetos de las clases Coche, Bicicleta, Círculo y Cuadrado
    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(5.0)
    val cuadrado = Cuadrado(4.0)

    // Demostrar el uso de los objetos
    coche.acelerar()
    bicicleta.acelerar()
    circulo.dibujar()
    println("Área del círculo: ${circulo.area}")
    cuadrado.dibujar()
    println("Área del cuadrado: ${cuadrado.area}")

}


