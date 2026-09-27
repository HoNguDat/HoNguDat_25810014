package buoi3

//Ho Ngu Dat - 25810014

fun ghiNhatKy1(hanhDong: String): Unit {
    println("[Nhật ký] $hanhDong")
}

fun ghiNhatKy2(hanhDong: String) {
    println("[Nhật ký] $hanhDong")
}

// Hai cách viết tương đương vì Kotlin tự hiểu kiểu trả về của hàm này là Unit.

fun main() {
    ghiNhatKy1("Đi vào ")
    ghiNhatKy2("Đi ra")
}