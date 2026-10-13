package buoi3

//Ho Ngu Dat -25810014

fun xuLyVanBan(
    noiDung: String,
    xuLy: (String) -> String
): String {
    return xuLy(noiDung)
}

fun vietHoaChuoi(chuoi: String): String {
    return chuoi.uppercase()
}

fun main() {
    // Cách 1
    val ketQua1 = xuLyVanBan("ho ngu dat", { it.uppercase() })
    println("Cách 1: $ketQua1")

    // Cách 2
    val ketQua2 = xuLyVanBan("Dai hoc SPKTHCM", ::vietHoaChuoi)
    println("Cách 2: $ketQua2")

    // Cách 3
    val ketQua3 = xuLyVanBan("hcmute") {
        it.uppercase()
    }
    println("Cách 3: $ketQua3")
}