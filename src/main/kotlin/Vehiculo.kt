//Interface vehiculo
interface Vehiculo {
    fun acelerar()
}
// Clase que implementa la interfaz Vehículo en este caso Bicicleta
class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("La bicicleta está en movimiento.")
    }
}

class Coche : Vehiculo {
    override fun acelerar() {
        println("El coche está acelerando.")
    }
}

// Definición de la clase que tendremos de abstracta
abstract class Forma {
    abstract val area: Double
    abstract fun dibujar()
}
// Clase que extiende la clase Forma: Círculo
class Circulo(val radio: Double) : Forma() {
    override val area: Double
        get() = Math.PI * radio * radio

    override fun dibujar() {
        println("Dibujando un círculo con radio $radio.")
    }
}
// Clase que extiende la clase Forma: Cuadrado
class Cuadrado(val lado: Double) : Forma() {
    override val area: Double
        get() = lado * lado

    override fun dibujar() {
        println("Dibujando un cuadrado con lado $lado.")
    }
}