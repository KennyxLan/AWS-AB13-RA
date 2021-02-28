// Q4's Answer:

fun main() {

    var aHuman: Human = Human("Jason Derulo")
    aHuman.attack()

}

class Human(var name: String){ // class Human has a property called name
    
    fun attack() {
        println("$name uses Fist Attack!")
    }

}
