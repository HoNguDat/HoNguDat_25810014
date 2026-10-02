//Ho Ngu Dat - 25810014

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sanPham1 = SanPham("Điện thoại Nokia", 17000000.0, 11)

    val sanPham2 = SanPham(
        tenSanPham = "Chuột có dây",
        gia = 500000.0
    )

    println("Sản phẩm 1:")
    println("Tên sản phẩm: ${sanPham1.tenSanPham}")
    println("Giá: ${sanPham1.gia} VNĐ")
    println("Số lượng tồn kho: ${sanPham1.soLuongTonKho}")

    println()

    println("Sản phẩm 2:")
    println("Tên sản phẩm: ${sanPham2.tenSanPham}")
    println("Giá: ${sanPham2.gia} VNĐ")
    println("Số lượng tồn kho: ${sanPham2.soLuongTonKho}")
}