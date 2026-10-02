package buoi4

//Ho Ngu Dat - 25810014

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sinhVien1 = SinhVien("25810014", "Ho Ngu Dat", 8.2)
    val sinhVien2 = SinhVien("25810012", "Ho Ngu Dat", 8.2)

    println("Sinh viên 1:")
    println(sinhVien1)

    println()

    println("Hai sinh viên có giống nhau không: ${sinhVien1 == sinhVien2}")

    val sinhVien3 = sinhVien1.copy(diemTrungBinh = 9.0)

    println()
    println("Sinh viên tạo từ copy:")
    println(sinhVien3)
}