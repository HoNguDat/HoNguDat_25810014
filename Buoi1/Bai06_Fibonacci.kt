package com.example.buoi1

//Ho Ngu Dat - 25810014
fun main() {
    var a = 0
    var b = 1
    var viTri = 0

    for (i in 0..20) {
        if (a >= 100) {
            break
        }
        println("Vị trí $viTri: $a")

        val soTiepTheo = a + b
        a = b
        b = soTiepTheo
        viTri++
    }
}