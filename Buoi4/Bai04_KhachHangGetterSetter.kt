package buoi4

//Ho Ngu Dat - 25810014

class KhachHang(
    var ho: String,
    var ten: String
) {

    var hoTen: String
        get() {
            return "$ho $ten"
        }
        set(value) {
            val phanTen = value.split(" ")

            ho = phanTen[0]
            ten = phanTen[1]
        }
}

fun main() {
    val khachHang = KhachHang("Ho", "Dat")

    println("Họ tên ban đầu: ${khachHang.hoTen}")

    khachHang.ten = "Khoa"
    println("Sau khi đổi tên: ${khachHang.hoTen}")

    khachHang.hoTen = "Tran Van"

    println("Họ sau khi tách: ${khachHang.ho}")
    println("Tên sau khi tách: ${khachHang.ten}")
}