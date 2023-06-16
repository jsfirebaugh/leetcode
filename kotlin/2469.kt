fun convertTemperature(celsius: Double): DoubleArray {
    val fahrenheit = (celsius * 1.8) + 32.00
    val kelvin = celsius + 273.15
    return doubleArrayOf(kelvin, fahrenheit)
}

fun main() {
    println(convertTemperature(36.50).joinToString())
    println(convertTemperature(122.11).joinToString())
}