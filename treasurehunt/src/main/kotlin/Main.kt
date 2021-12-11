/* Sort list from higher number to low. Add up all the numerical values of the list
   and devided by Highets number (6). If total of devided number is'nt a whole number (Int) than keep     
   adding number (4...) to highest number (6) until find a whole number which can be
   diveded by total (16). If this gets the right value which could be devided with whole number than
   that is the number of how many pirates can split the gold equally.
*/

val list = listOf(6,3,4,2,1).sorted().reversed()

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


