package cl.awakelabs.kotlin13a

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main() {
   val resultado = suma(4.9, 9.9F)
   val redondo = redondeo(resultado)
   val muestraResultado = muestraResultado(resultado)

    println("El resultado es $redondo")
    println("En Pesos es $muestraResultado")

}

fun suma(param1:Double,param2:Float): Double = param1 + param2

fun redondeo (param1: Double) = ceil(param1)
fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("CLP"))
    println(format.format(numero))
    return format.format(numero)

}


