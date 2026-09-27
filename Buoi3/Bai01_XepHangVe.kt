package buoi3

//Ho Ngu Dat - 25810014

fun main() {
    val tuoi = 26
    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi >= 60) {
        "Vé cao tuổi"
    } else {
        "Vé người lớn"
    }
    println("Loại vé: $loaiVe")
}