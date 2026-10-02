package buoi4

//Ho Ngu Dat - 25810014

open class DongVat(
    val ten: String
) {
    open fun keu(): String {
        return "Động vật đang kêu"
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSach = listOf(
        Cho("Milo"),
        Meo("Miu"),
        Cho("Lucky"),
        Meo("Mun")
    )

    for (conVat in danhSach) {
        println("Tên: ${conVat.ten}")
        println("Tiếng kêu: ${conVat.keu()}")
        println()
    }
}