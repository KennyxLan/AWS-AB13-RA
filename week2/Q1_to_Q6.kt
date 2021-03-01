
// Q1. What is Inheritance? Try to explain in Mandarin.
繼承。假設類別B繼承類別A，類別A稱為基礎類別(base class)，類別B稱為衍生類別(derived class)。類別B將擁有類別A的屬性(data members)及函數(member functions)。
例如：

fun main(){

    var lion = Animal("Lion King")
    lion.jump()

    var dog = Dog("Golden Retriever")
    dog.jump()
    dog.bark()

}

open class Animal(val name: String){  // class Animal is a base class
    fun jump(){
        println("$name jumps")
    }
}

class Dog(name: String): Animal(name){  // class Dog is a derived class
    fun bark(){
        println("$name barks")
    }
}



// Q2. How to 'split' a string in Android? Explain your understanding, and even better to attach some sample code.
Use the function
    fun CharSequence.split(
        vararg delimiters: String,
        ignoreCase: Boolean = false,
        limit: Int = 0
    ): List<String>
 
// sample code
fun main(){

    var str: String = "It is    sunny today. Let's go to school and play basketball!"
    val delim: String = " "
    var newString = str.split(delim)  // split() returns a List of Strings.  Two consecutive delimiters will result in an empty String.
    println(str) // str is unchanged
    println(newString) // println() can print a List of Strings
    println(newString.size)

} // end of sample code



//Q3. 
