fun main() {
    print("Masukkan karakter: ")
    val karakter = readln().first()
    val asciiValue = karakter.code
    
    println("Karakter: $karakter")
    println("Kode Karakter: $asciiValue")
    println("Apakah karakter tersebut termasuk huruf: ${karakter.isLetter()}")
    println("Apakah karakter tersebut termasuk angka: ${karakter.isDigit()}")
}