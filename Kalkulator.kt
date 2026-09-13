fun tambah(a: Double, b: Double): Double = a + b

fun kurang(a: Double, b: Double): Double = a - b

fun kali(a: Double, b: Double): Double = a * b

fun bagi(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    println("Pilihan operasi:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")
    
    print("Masukkan pilihan (1-4): ")
    val pilihan = readln().toInt()
    
    print("Masukkan angka pertama: ")
    val angka1 = readln().toDouble()
    
    print("Masukkan angka kedua: ")
    val angka2 = readln().toDouble()
    
    when (pilihan) {
        1 -> println("Hasil: ${tambah(angka1, angka2)}")
        2 -> println("Hasil: ${kurang(angka1, angka2)}")
        3 -> println("Hasil: ${kali(angka1, angka2)}")
        4 -> {
            if (angka2 == 0.0) {
                println("Kesalahan: Tidak dapat melakukan pembagian dengan nol!")
            } else {
                println("Hasil: ${bagi(angka1, angka2)}")
            }
        }
        else -> println("Pilihan tidak valid.")
    }
}