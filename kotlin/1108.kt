
fun defangIPAddr(address: String): String {
    return address.replace(".", "[.]")
}

fun main() {
    println(defangIPAddr("1.1.1.1"))
    println(defangIPAddr("255.100.50.0"))
}