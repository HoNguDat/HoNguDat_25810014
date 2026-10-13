package buoi3

//Ho Ngu Dat -25810014

// Cách viết đầy đủ
fun tinhBinhPhuong(so: Int): Int {
    return so * so
}

// Cách viết rút gọn
fun binhPhuong(so: Int) = so * so

// Cách viết đầy đủ
fun tinhChuVi(canh: Double): Double {
    return canh * 4
}

// Cách viết rút gọn
fun chuVi(canh: Double) = canh * 4

// Cách viết đầy đủ
fun kiemTraChan(n: Int): Boolean {
    return n % 2 == 0
}

// Cách viết rút gọn
fun laChan(n: Int) = n % 2 == 0

fun main() {
    val so = 6
    println("Bình phương đầy đủ: ${tinhBinhPhuong(so)}")
    println("Bình phương rút gọn: ${binhPhuong(so)}")

    val canh = 5.0
    println("Chu vi đầy đủ: ${tinhChuVi(canh)}")
    println("Chu vi rút gọn: ${chuVi(canh)}")

    val giaTri = 12
    println("Kiểm tra chẵn đầy đủ: ${kiemTraChan(giaTri)}")
    println("Kiểm tra chẵn rút gọn: ${laChan(giaTri)}")
}