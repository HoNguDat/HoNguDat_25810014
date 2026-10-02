package buoi4

//Ho Ngu Dat - 25810014

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {

    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV204", "Pham Minh Khoa", 8500000.0)

    val nv2 = NhanVien("Doan Ngoc Linh")

    println("Nhân viên 1:")
    println("Tên: ${nv1.ten}")
    println("Lương tháng: ${nv1.luongThang} VNĐ")

    println()

    println("Nhân viên 2:")
    println("Tên: ${nv2.ten}")
    println("Lương tháng: ${nv2.luongThang} VNĐ")

    // println(nv1.maNhanVien) // Lỗi biên dịch vì maNhanVien không có val hoặc var nên không thể truy cập bên ngoài class.
}