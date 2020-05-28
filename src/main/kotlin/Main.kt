fun main(args: Array<String>) {

    val dracula = VampireKing("dracula")
    println(dracula)
    dracula.takeDamage(12)
    println(dracula)

    while (dracula.lives > 0) {
        /*if(dracula.dodges()){
            continue
        }
*/
        if (dracula.runAway()) {
            println("dracula ran away")
            break
        } else {
            dracula.takeDamage(12)
        }
    }



}