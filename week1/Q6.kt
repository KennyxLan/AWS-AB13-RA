// Q6's Answer:

fun main() {

    var jinx = Human("Jinx")
    println("${jinx.name} has Mana? == ${jinx.hasMana}")

    var lux = Mage("Lux")
    println("${lux.name} has Mana? == ${lux.hasMana}")

}

open class Human(var name: String){ // class Human has a property called name

    var hasMana: Boolean = false
    open fun attack() {
        println("$name uses Fist Attack!")
    }

}

class Mage(name: String): Human(name){

    init{
        hasMana = true
    }

    override fun attack(){
        println("$name uses Fireball!")
    }

}
