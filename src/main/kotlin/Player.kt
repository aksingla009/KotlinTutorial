/*
class Player (val name: String) {//Primary Constructor
    var lives = 3 // This is a property
    var level = 1 // this is a property
    var score = 0 // this is a property

    fun showDetails(){
        // To split the print ln statement into seveal lines use 3 DOuble quotes
        println("""
Name   : $name
Lives  : $lives
Level  : $level
Scores : $score
        """)
    }

}*/
class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {//Primary Constructor

    var weapon: Weapon = Weapon("fist", 1)

    private val inventory = ArrayList<Loot>()

    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {// this String after : means that function will return a String
        // To split the print ln statement into seveal lines use 3 DOuble quotes

        return """ 
Name   : $name
Lives  : $lives
Level  : $level
Scores : $score
Weapon Details are:
${weapon}
        """.trimIndent()
    }

    fun addLoot(item: Loot) {
        inventory.add(item)
        //Code to save inventory on any storage will go here
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    //Here we will overload a function
    fun dropLoot(name: String): Boolean {
        println("$name will be dropped")
        for(item in inventory){
            if(item.name == name){
                inventory.remove(item)
                return true
            }

        }
        return false
//        return inventory.removeIf { it.name == name }
    }

    fun showInventory() {
        var total = 0.0
        println("======================")
        println("$name's inventory")

        for (item in inventory) {
            println(item)
            total += item.value
        }
        println("======================")
        println("Total is $total")
    }

}