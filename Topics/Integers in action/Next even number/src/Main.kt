fun main() {
    //Input
    var input = readln().toInt()
    //Schauen ob gerade oder ungerade
    if ((input % 2) != 0){
        input++
    }
    else
        input += 2
    //output
    println(input)
}