fun main() {
    print("Masukkan bilangan desimal: ")
    val desimal = readln()
    val desimalToDouble = desimal.toDouble()
    val desimalToInt = desimalToDouble.toInt()
    
    println("Nilai Double: $desimalToDouble")
    println("Nilai Int: $desimalToInt")
    println("Nilai String: $desimal")
}