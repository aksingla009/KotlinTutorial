/*
class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
    // By Default Any class can't be inherited as it was possible in java
    // It can be treated same as if class is marked as final in java
    //i.e by default every class is final until we specify keyword open to it
    // so that it could be now made to be inherited by other classes

}*/
open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
    var staticPoints :Int = 0
    init {
         staticPoints = hitPoints
    }

    open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name has took $damage points damage and has $hitPoints hitpoints left")
        } else {
            lives -= 1
            hitPoints = staticPoints
            println("$name lost his life")
        }
    }


    override fun toString(): String {
        return "$name has $lives lives with $hitPoints points left"
    }
}