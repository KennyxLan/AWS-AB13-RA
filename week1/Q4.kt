// Q4's Answer:

fun main() {

    var stark: Human = Human("Iron Man")
    stark.attack()

}

class Human(var name: String){ // class Human has a property called name

    fun attack() {
        println("$name uses Fist Attack!")
    }

}
