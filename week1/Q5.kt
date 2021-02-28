// Q5's Answer:

fun main() {

    var gandalf: Mage = Mage("Gandalf the White")
    gandalf.attack()

}

open class Human(var name: String){ // class Human has a property called name

    open fun attack() {
        println("$name uses Fist Attack!")
    }

}

class Mage(name: String): Human(name){

    override fun attack(){
        println("$name uses Fireball!")
    }

}
