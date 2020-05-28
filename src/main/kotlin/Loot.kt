enum class LootType {
    POTION, RING, ARMOR
    //These are the three types of loot a player may pick up
}

class Loot (val name:String, val type:LootType,val value:Double){//value holds the cost of that item in dollar and cents

    override fun toString(): String {
        return "$name is a $type and is worth $value"
    }


}