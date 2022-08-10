fun main() {
    var i1 = readln().toUInt()
    if ((i1 % 2u) != 0u){
        i1++
        //println("Schüler mit Einzeltüsch erkannt ")
    }
    var i2 = readln().toUInt()
    if ((i2 % 2u) != 0u){
        i2++
        //println("Schüler mit Einzeltüsch erkannt ")
    }
    var i3 = readln().toUInt()
    if ((i3 % 2u) != 0u){
        i3++
        //println("Schüler mit Einzeltüsch erkannt ")
    }
    var counter = i1 + i2 + i3
    print(counter/ 2u)
}