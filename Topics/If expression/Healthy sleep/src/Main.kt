fun main() {    
    // Input A B H
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    //Logic
    if (a > b){
        println(false)
    } else if (h < a){
        println("Deficiency")
    }else if (h > b){
        println("Excess")
    } else
        println("Normal")
}