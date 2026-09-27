package com.example.buoi1

//Ho Ngu Dat -  25810014
fun main() {
    val tenKhachHang: String? = null
    val doDai = tenKhachHang?.length
    println("Độ dài tên: $doDai")
    val tenHienThi = tenKhachHang ?: "Khách vãng lai"
    println("Tên khách hàng: $tenHienThi")

    // !! chỉ nên dùng khi chắc chắn biến không rỗng.
    // Nếu biến là null, chương trình sẽ gây lỗi khi chạy.
    val tenChacChan: String? = "Ho Ngu Dat"
    println("Tên sử dụng !!: ${tenChacChan!!}")
}