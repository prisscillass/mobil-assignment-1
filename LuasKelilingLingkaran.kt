fun main() {
    print("Masukkan jari jari lingkaran: ")
    val r = readln().toDouble()
    val keliling = 2 * Math.PI * r
    val luas = Math.PI * r * r
    
    println("Keliling lingkaran: $keliling")
    println("Luas lingkaran: $luas")
}