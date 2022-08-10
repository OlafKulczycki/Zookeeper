fun main() {
    val numParts = readln().toInt()
    var rejections = 0
    var larger = 0
    var perfect = 0

    repeat(numParts){
        val size = readln().toInt()
        if (size == 0)
            perfect++
        else if (size == 1)
            larger++
        else if (size == -1)
            rejections++
    }
    println("$perfect $larger $rejections")
}