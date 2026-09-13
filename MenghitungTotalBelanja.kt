fun main() {
    print("Masukkan nama barang: ")
    val namaBarang = readln()
    print("Masukkan harga barang: ")
    val hargaBarang = readln().toDouble()
    print("Masukkan jumlah barang: ")
    val jumlahBarang = readln().toInt()
    print("Masukkan diskon (%): ")
    val diskon = readln().toDouble()

    val subtotal = hargaBarang * jumlahBarang
    val potongan = subtotal * (diskon / 100)
    val totalBayar = subtotal - potongan

    println("Barang: $namaBarang")
    println("Subtotal: Rp$subtotal")
    println("Potongan: Rp$potongan")
    println("Total Bayar: Rp$totalBayar")
}