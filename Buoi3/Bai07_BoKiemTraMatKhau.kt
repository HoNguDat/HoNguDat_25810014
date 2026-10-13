package buoi3

//Ho Ngu Dat -25810014

fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau ->
        matKhau.length >= 8
    }

    val matKhau1 = "dat123"
    val matKhau2 = "dat1234"
    val matKhau3 = "dat1234567"

    println("$matKhau1 hợp lệ: ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 hợp lệ: ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 hợp lệ: ${kiemTraDoDai(matKhau3)}")
}