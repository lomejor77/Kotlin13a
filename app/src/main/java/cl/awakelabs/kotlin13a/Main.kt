package cl.awakelabs.kotlin13a

import kotlin.math.ceil

fun main() {
   var resultado = suma(4.5, 9.9F)
   var redondo = redondeo(resultado)
    println("El resultado es $resultado")

    println("El resultado es $redondo")
}

fun suma(param1:Double,param2:Float): Double = param1 + param2

fun redondeo (param1: Double) = ceil(param1)

