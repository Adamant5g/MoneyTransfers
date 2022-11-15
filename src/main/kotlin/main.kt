fun main() {
    val transaction = 10000
    val commission = 0.75
    val minimalСommission = 35
    var finalСommission = (transaction * commission) / 100
    if (finalСommission < minimalСommission) {
        println(minimalСommission)
    } else println(finalСommission)
}