package com.example.buoi1


fun main() {
    val soLuong: Int = 5
    val donGia: Double = 20000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Số lượng: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế 8%: $thue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}