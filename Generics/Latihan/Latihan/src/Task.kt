// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    if(args is String){
        return args.length
    } else if (args is Int) {
        return args * 5
    } else {
        return 0
    }
}