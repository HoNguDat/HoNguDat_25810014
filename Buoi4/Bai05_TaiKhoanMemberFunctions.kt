//Ho Ngu Dat - 25810014

class TaiKhoanNganHang(
    val soTaiKhoan: String,
    var soDu: Double
) {

    fun napTien(soTien: Double) {
        soDu = soDu + soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu = soDu - soTien
            return true
        }

        return false
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("T1234", 5000000.0)

    println("Số dư ban đầu: ${taiKhoan.soDu} VNĐ")

    taiKhoan.napTien(1200000.0)
    println("Sau khi nạp 1.200.000 VNĐ: ${taiKhoan.soDu} VNĐ")

    val ketQua1 = taiKhoan.rutTien(1000000.0)
    println("Rút 1.000.000 VNĐ: $ketQua1")
    println("Số dư hiện tại: ${taiKhoan.soDu} VNĐ")

    val ketQua2 = taiKhoan.rutTien(5000000.0)
    println("Rút 5.000.000 VNĐ: $ketQua2")
    println("Số dư hiện tại: ${taiKhoan.soDu} VNĐ")

    taiKhoan.napTien(2500000.0)
    println("Sau khi nạp 2.500.000 VNĐ: ${taiKhoan.soDu} VNĐ")
}