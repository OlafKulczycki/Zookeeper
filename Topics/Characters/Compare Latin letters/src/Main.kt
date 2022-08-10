fun main() {
    val ch1: Char = readln().first()
    val ch2: Char = readln().first()
    if (ch1 == ch2){
        println(true)
    }
    else if (ch1.isUpperCase() && ch2.isLowerCase()){
        if (ch1.lowercaseChar() == ch2){
            println(true)
        }
        else
            println(false)
    }
    else if (ch1.isLowerCase() && ch2.isUpperCase())
        if (ch1.uppercaseChar() == ch2){
            println(true)
        }
        else
            println(false)
    else
        println(false)
}