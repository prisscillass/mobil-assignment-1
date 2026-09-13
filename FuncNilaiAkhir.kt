fun hitungNilaiAkhir(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80.0 -> "A"
        nilai >= 70.0 -> "B"
        nilai >= 60.0 -> "C"
        nilai >= 50.0 -> "D"
        else -> "E"
    }
}

fun main() {
    print("Masukkan nilai tugas: ")
    val tugas = readln().toDouble()
    print("Masukkan nilai uts: ")
    val uts = readln().toDouble()
    print("Masukkan nilai uas: ")
    val uas = readln().toDouble()

    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)
    
    println("Nilai Akhir : $nilaiAkhir")
    println("Grade       : $grade")
}