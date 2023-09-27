//nama package -> package -> file
import com.rengga.oop.utils.Util
import com.rengga.oop.utils.iniFunction

fun main() {
    val animal = Animal()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
    Util()
    iniFunction()
}