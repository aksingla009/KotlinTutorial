class Weapon (val name:String,var damageInflicted:Int){

    override fun toString(): String {
        return """
            Weapon Name : $name
            Damage Inflicted is : $damageInflicted
        """.trimIndent()
    }
}