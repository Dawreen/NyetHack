fun main() {
    val name = "DanDo"
    var healthPoints = 100
    val isBlessed = true

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    //println(name + healthStatus)
    println("$name $healthStatus")
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    startGame()
}

// single-expression function
/**
 * For single-expressionfunctions, you can omit
 * the return type, curly braces, and return statement.
 */
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> " is in excellent condition!"
        in 90..99 -> " has a few scratches."
        in 75..89 -> if (isBlessed) {
            " has some minor wounds but is healing quite quickly!"
        } else {
            " has some mino wounds."
        }
        in 15..75 -> " looks pretty hurt."
        else -> " is in awful condition!"
    }

private fun startGame(): String =
    TODO("graphic missing!")