fun main() {
    val name = "DanDo"
    var healthPoints = 100
    val isBlessed = true

    val healthStatus = if (healthPoints == 100) {
        " is in excellent condition!"
    } else if (healthPoints >= 90) {
        " has a few scratches."
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            " has some minor wounds but is healing quite quickly!"
        } else {
            " has some mino wounds."
        }
    } else if (healthPoints >= 15) {
        " looks pretty hurt."
    } else {
        " is in awful condition!"
    }

    println(name + healthStatus)
}