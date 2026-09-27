package com.example.buoi1

//Ho Ngu Dat - 25810014

fun main() {
    println("--- DEM NGUOC ---")
    var i = 10
    while (i >= 1) {
        println(i)
        i--
    }
    println()
    println("--- IN CO DINH 5 LAN ---")
    repeat(5) {
        println("Ho Ngu Dat")
    }

    // Ghi chu so sanh:
    // dùng while khi chưa biết trước số lần lặp (lặp theo điều kiện).
    // dùng repeat khi đã biết chính xác số lần muốn lặp lại một hành động.
}