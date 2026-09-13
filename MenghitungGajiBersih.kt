fun main() {
    val namaPegawai = "Priscilla Sudiyantoro"
    val gajiPokok = 4500000.0
    val tunjangan = 1000000.0
    val uangLembur = 750000.0
    val potongan = 200000.0

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println("Nama Pegawai: $namaPegawai")
    println("Gaji Kotor: Rp$gajiKotor")
    println("Gaji Bersih: Rp$gajiBersih")
}