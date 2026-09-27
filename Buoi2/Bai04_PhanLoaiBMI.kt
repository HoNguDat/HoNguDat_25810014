package com.example.buoi1

//Ho Ngu Dat - 25810014
fun main() {
    val canNang: Double = 81.0
    val chieuCao: Double = 1.73
    val bmi = canNang / (chieuCao * chieuCao)
    println("Chỉ số BMI: $bmi")
    if (bmi < 18.5) {
        println("Phân loại: Gầy")
    } else if (bmi < 25.0) {
        println("Phân loại: Bình thường")
    } else if (bmi < 30.0) {
        println("Phân loại: Hơi mập")
    } else {
        println("Phân loại: Mập")
    }
}