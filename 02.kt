fun main(args: Array<String>) {
    print(squareDigits(123))
}

fun squareDigits(n: Int): Int{
    val numStr = n.toString()
    var arrNum = numStr.map { it.toString().toInt()}
    arrNum = arrNum.map { it * it }
    var result = ""
    arrNum.forEach { result += it.toString() }
    return result.toInt()
}