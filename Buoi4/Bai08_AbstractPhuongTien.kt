package buoi4

//Ho Ngu Dat - 25810014

abstract class PhuongTienDiChuyen {

    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phương tiện có tốc độ tối đa: $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {

    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {

    override val tocDoToiDa: Int = 200
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    xeMay.moTa()
    oTo.moTa()
}