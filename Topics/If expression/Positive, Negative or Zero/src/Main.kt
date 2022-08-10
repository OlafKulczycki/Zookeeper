fun main() {
    val input = readln().toInt()
    if (input == 0){
        println("zero")
    } else if (input < 0){
        println("negative")
    } else if (input > 0) {
        println("positive")
    } else
        println(false)
}