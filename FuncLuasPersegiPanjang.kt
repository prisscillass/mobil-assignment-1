fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main() {
    val panjang = 10.0
    val lebar = 5.0
    val luas = hitungLuas(panjang, lebar)
    
    println("Panjang : ${panjang.toInt()}")
    println("Lebar   : ${lebar.toInt()}")
    println("Luas    : ${luas.toInt()}")
}