class Kamarkos(val nomorKamar: String) {
    var harga: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
                println("Log: Harga kamar $nomorKamar diatur menjadi Rp$field")
            } else {
                println("Error: Validasi gagal! Harga kamar tidak boleh bernilai negatif.")
            }
        }
        
    var statusTersedia: Boolean = true
        private set
        
    fun prosesPemesanan() {
        if (statusTersedia) {
            statusTersedia = false
            println("Log: Kamar $nomorKamar berhasil dipesan, status menjadi tidak tersedia.")
        } else {
            println("Log: Maaf, Kamar $nomorKamar sudah terisi.")
        }
    }
}

class Pesanan(val idPesanan: String, val namaPencariKos: String) {
    var statusPesanan: String = "Menunggu Konfirmasi"
        private set 
        
    fun konfirmasiOlehPemilik() {
        statusPesanan = "Dikonfirmasi"
        println("Log: Pesanan $idPesanan atas nama $namaPencariKos telah dikonfirmasi.")
    }
}
