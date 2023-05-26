fun main(args: Array<String>) {
    print(reversedStr("Input some word here"))
}

fun reversedStr(str: String): String {
    val listStr = str.split(" ")
    val listRvsStr = arrayListOf<String>()
    listStr.forEach {listRvsStr.add(it.reversed())}
    var rvsStr = ""
    listRvsStr.forEach{rvsStr+=it+ " "}
    return rvsStr
}