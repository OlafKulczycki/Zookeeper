fun main() {
    val seq = readln().toInt()
    var maxNr: Int = 0
    repeat(seq){
        val input = readln().toInt()
        if (input > 1000)
            println(false)
        else if ((input % 4) == 0 && input > maxNr)
            maxNr = input
    }
    println(maxNr)
}