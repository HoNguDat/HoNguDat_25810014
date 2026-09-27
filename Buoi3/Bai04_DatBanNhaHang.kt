package buoi3

//Ho Ngu Dat - 25810014

fun datBan(tenKhach: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Khách: $tenKhach, Số lượng: $soLuongKhach, Loại bàn: $loaiBan")
}

fun main() {
    // Cách 1:
    datBan("Ho Ngu Dat 1", 2)

    // Cách 2
    datBan("Ho Ngu Dat 2", 4, "Bàn VIP")

    // Cách 3:
    datBan(
        tenKhach = "Ho Ngu Dat 3",
        soLuongKhach = 6,
        loaiBan = "Bàn ngoài trời"
    )
}