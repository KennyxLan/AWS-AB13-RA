
//// Q1. What is Inheritance? Try to explain in Mandarin.
繼承。假設類別B繼承類別A，類別A稱為基礎類別(base class)，類別B稱為衍生類別(derived class)。類別B將擁有類別A的屬性(data members)及函數(member functions)。

// sample code:
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
} // end of sample code



//// Q2. How to 'split' a string in Android? Explain your understanding, and even better to attach some sample code.
Use the function
    fun CharSequence.split(
        vararg delimiters: String,
        ignoreCase: Boolean = false,
        limit: Int = 0
    ): List<String>
 
// sample code:
fun main(){

    var str: String = "It is    sunny today. Let's go to school and play basketball!"
    val delim: String = " "
    var newString = str.split(delim)  // split() returns a List of Strings.  Two consecutive delimiters will result in an empty String.
    println(str) // str is unchanged
    println(newString) // println() can print a List of Strings
    println(newString.size)

} // end of sample code



//// Q3. 



//// Q4. What's the difference between ArrayList and LinkedList? Try to explain in Mandarin.
ArrayList 與 LinkedList 皆屬於線性資料結構。
ArrayList 類似Vector，是透過array實作；當array空間已滿且需要擴大時，需先建立一個新的array，再將資料從舊array搬移到新array，較花時間。 --> 時間複雜度 O(n)
LinkedList 是透過doubly linked list實作；在已知欲新增或刪除的node位置(pointer)時，可立即新增或刪除node，不需一一搬移資料。 --> 時間複雜度 O(1)
(ArrayList、LinkedList 在不同的operation下可能有不同的時間複雜度，須視情況採用合適的資料結構。)
(Reference:  https://medium.com/zero-equals-false/arraylist-vs-linkedlist-vs-vector-22e1721a66b0  )


//// Q5.
 
 
 
//// Q6.
Int變數(32bit)的數值範圍為	[ -2 147 483 648 , 2 147 483 647 ] 即 [ -2^31, 2^31 - 1 ] 。
若要儲存超過此範圍的變數，可以使用Long (64bit)，其範圍為[ -9 223 372 036 854 775 808 , 9 223 372 036 854 775 807 ] 即 [ -2^63, 2^63 - 1]。
(Reference:  https://kotlinlang.org/docs/basic-types.html  )
