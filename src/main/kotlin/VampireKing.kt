import java.util.*

/*
class VampireKing(name : String) : Vampire(name,140) {
}*/
class VampireKing(name: String) : Vampire(name,140) {
//    init {
//        hitPoints = 140
//    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean{
        return lives < 2
    }

    fun dodges():Boolean{
        val random = Random()
        val chance = random.nextInt(6) // ranges from 0 to 5
        return if(chance > 3){
            println("Dracula dodges")
            true
        }else{
            false
        }

    }
}