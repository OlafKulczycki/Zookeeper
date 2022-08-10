fun main() {
    val ch: Char = readln().first()
    val isDigit = ch >= '\u0031' && ch <= '\u0039'

    if (ch.isLetter()){
        if (ch.isUpperCase())
            println(true)
        else
            println(false)

    }
    else if (isDigit){
        println(true)
    }
    else
        println(false)
}