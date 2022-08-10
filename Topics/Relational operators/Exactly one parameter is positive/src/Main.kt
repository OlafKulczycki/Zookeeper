fun main() {
    val i1 = readln().toInt()
    val i2 = readln().toInt()
    val i3 = readln().toInt()

    if (i1 >0 && i2 <= 0 && i3 <= 0 ){
        println(true)
    }
    else if (i2 >0 && i1 <= 0 && i3 <= 0 ){
        println(true)
    }
    else if (i3 >0 && i2 <= 0 && i1 <= 0 ){
        println(true)
    }
    else
        println(false)
}