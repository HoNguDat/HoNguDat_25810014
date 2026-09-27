package buoi3

//Ho Ngu Dat - 25810014

fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soDienThoai: String,
    phuong: String = "Phường 11",
    quan: String = "Quận GV",
    thanhPho: String = "TP. Hồ Chí Minh"
) {
    println("Người nhận: $tenNguoiNhan")
    println("Số điện thoại: $soDienThoai")
    println("Địa chỉ: $phuong, $quan, $thanhPho")
}

fun main() {
    dinhDangDiaChi(
        tenNguoiNhan = "Ho Ngu Dat",
        soDienThoai = "123456789",
        phuong = "Phường 12",
        quan = "Quận 12",
        thanhPho = "TP. Hồ Chí Minh"
    )
}