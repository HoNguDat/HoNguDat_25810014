package buoi4

//Ho Ngu Dat - 25810014

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    soDuBanDau: Double
) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong, so du ban dau: $soDuBanDau VNĐ")
        }
    }
}

fun main() {
    val taiKhoan1 = TaiKhoanNganHang("TK3068", 4500000.0)

    println()

    val taiKhoan2 = TaiKhoanNganHang("TK7194", -800000.0)
}