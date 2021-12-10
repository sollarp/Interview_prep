
val list = listOf(4,4,4).sorted().reversed()

fun getSum(list: List<Int>): Int {
    return list.sum()
}

fun getHighest(list: List<Int>): Float {
    return list.maxOf { it.toFloat() }
}

fun isInteger(convert: Float): Boolean {
    val x = convert.toInt()
    val conNum = convert - x
    if (conNum > 0.0) {
        return false
    }
    return true
}
fun main() {
    val sum: Float = getSum(list).toFloat()
    val highestNum: Float = getHighest(list)
    val firstNum = isInteger(highestNum)
    if (firstNum) {
        val n = sum / highestNum
        println("Can be split between ${n.toInt()} pirates")
    }else {
        for (i in 1 until list.size) {
            val equalNum: Float = highestNum.plus(list[i])
            val dev: Float = sum / equalNum
            val getInteger = isInteger(dev)
            if (getInteger) {
                println("Can be split between $dev pirates")
            } else {
                println("Can't be split bury it")
            }
        }
    }
}


