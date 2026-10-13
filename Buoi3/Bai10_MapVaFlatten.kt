package buoi3

//Ho Ngu Dat -25810014

fun main() {
    val cacSo = listOf(2, 4, 6, 8, 10)

    val soDaNhanDoi = cacSo.map { it * 2 }

    println("Danh sách ban đầu: $cacSo")
    println("Danh sách sau khi nhân đôi: $soDaNhanDoi")

    println()

    val danhSachLongNhau = listOf(
        listOf(1, 3, 5),
        listOf(2, 4),
        listOf(6, 8, 10)
    )

    val danhSachPhang = danhSachLongNhau.flatten()

    println("Danh sách lồng nhau: $danhSachLongNhau")
    println("Danh sách sau khi flatten: $danhSachPhang")
}