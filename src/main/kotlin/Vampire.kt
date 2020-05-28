open class Vampire(name: String, hitpoints : Int = 20) : Enemy(name,hitpoints,3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
        //Vampire takes half damage lets suppose
    }
}
/*
open class Vampire(name: String) : Enemy(name,20,3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
        //Vampire takes half damage lets suppose
    }
}*/
