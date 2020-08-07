fun main() {
    /*
    * let makes the var non-nullable using the it
    */
    var beverage0 = readLine()?.let {
        if (it.isNotBlank())
            it.capitalize()
        else
            "Buttered Ale"
    }
//    beverage = null
    /*
    * I don’t care whetherbeverage is null; capitalize it anyway
    */
    var beverage = readLine()!!.capitalize()

    println(beverage)
    println(beverage0)
}