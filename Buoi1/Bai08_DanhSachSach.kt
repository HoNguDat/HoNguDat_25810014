package com.example.buoi1

//Ho Ngu Dat - 25810014
fun main() {
    val danhSachSach = mutableListOf(
        "kotlin",
        "Java",
        "C#",
        "C++",
        "typeScript"
    )
    println("Danh sách ban đầu:")
    println(danhSachSach)
    danhSachSach.add("JavaScript")
    danhSachSach.add("Golang")
    danhSachSach.remove("Golang")
    danhSachSach.sort()
    println("Danh sách sau khi xử lý:")
    println(danhSachSach)
}