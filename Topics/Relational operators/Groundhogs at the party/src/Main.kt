fun main() {
    // input
    var reeses = readln().toInt()
    val weekend = readln().toBoolean()
    //logic
    if (reeses in 10..20 && !weekend){
        println(true)
    }
    else if (reeses in 15..25 && weekend){
        println(true)
    }
    else
        println(false)
}