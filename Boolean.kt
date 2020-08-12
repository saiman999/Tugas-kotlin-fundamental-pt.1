fun main() {
     val nilai = 71
    val hasil : String

    hasil = if (nilai > 90) {
        "A"
    } else if (nilai > 80 && nilai <= 98) {
        "B"
    } else if (nilai > 70 && nilai <=98) {
        "C"
    } else {
        "D"
    }

            print("Nilai $nilai = $hasil")
}