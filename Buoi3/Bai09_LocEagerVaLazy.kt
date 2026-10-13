package buoi3

//Ho Ngu Dat -25810014

fun main() {
    val nhacCu = listOf(
        "Guitar",
        "Piano",
        "Saxophone",
        "Trống",
        "Sáo",
        "Gõ"
    )

    val chuCai = "S"
    val ketQua1 = nhacCu.filter { it.startsWith(chuCai, ignoreCase = true) }
    println("Kết quả lọc thông thường: $ketQua1")
    val ketQua2 = nhacCu.asSequence()
        .filter { it.startsWith(chuCai, ignoreCase = true) }
        .toList()

    println("Kết quả lọc bằng Sequence: $ketQua2")
}