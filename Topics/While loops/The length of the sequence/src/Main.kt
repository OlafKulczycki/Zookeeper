fun main() {
    var exit = true
    var counter = 0
    while (exit){
        val input = readln().toInt()
        if (input == 0)
            exit = false
        else
            counter++
    }
    println(counter)
}