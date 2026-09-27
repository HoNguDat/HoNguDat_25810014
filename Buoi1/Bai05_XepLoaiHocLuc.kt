package com.example.buoi1

//Ho Ngu Dat - 25810014

fun main() {
    val diem: Double = 10.0
    when (diem) {
        in 8.5..10.0 -> println("Xếp loại: Xuất sắc")
        in 7.0..8.4 -> println("Xếp loại: Giỏi")
        in 5.5..6.9 -> println("Xếp loại: Khá")
        in 4.0..5.4 -> println("Xếp loại: Trung bình")
        in 0.0..3.9 -> println("Xếp loại: Yếu")
    }
}
