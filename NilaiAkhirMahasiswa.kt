fun main() {
    print("Masukkan nama mahasiswa: ")
    val namaMahasiswa = readln()
    print("Masukkan nilai tugas: ")
    val tugas = readln().toDouble()
    print("Masukkan nilai kuis: ")
    val kuis = readln().toDouble()
    print("Masukkan nilai uts: ")
    val uts = readln().toDouble()
    print("Masukkan nilai uas: ")
    val uas = readln().toDouble()

    val nilaiAkhir = (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)

    println("Nama Mahasiswa: $namaMahasiswa")
    println("Nilai Akhir: $nilaiAkhir")
}