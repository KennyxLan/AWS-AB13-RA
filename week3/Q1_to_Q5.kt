//// 1. What is Encapsulation? Try to list out the benefits of Encapsulation.
Encapsulation is an object-oriented programming practice where we wrap the data members (properties) and member functions (methods) inside a class.
The benefits of encapsulation includes:
- information hiding => We can hide the internal values / types of data members and implementation of a class.
- access control => We can specify how an object can be accessed by its clients. For example, only get() is allowed but set() is not provided.
- data validation => We can implement data validation in the set() function to make sure that the format or value of the user input is valid.





//// 2. Try to explain what is enum and why we use them.
`enum` is a collection of a number of constants(objects). We use `enum` in situations where only a certain number of possible values are allowed for a variable.





//// 3. How to use enum in Kotlin? Attach a sample code that uses enum in Kotlin.
enum class Planet{
    EARTH,
    MARS,
    JUPITER,
    SATURN
}

fun main(){
    println(Planet.values().size) // output:4
    for(i in 0 until Planet.values().size){ // output:(0, EARTH)  (1, MARS)  (2, JUPITER)  (3, SATURN)
        print("($i, ${Planet.values()[i]})  ")
    }
}





//// 4. What are the differences between LinearLayout and RelativeLayout? Try to explain indetails.
LinearLayout: The elements in a LinearLayout are placed one after another in a sequence.The `android:orientation` of a LinearLayout can be `vertical` or `horizontal`.
RelativeLayout: The elements in a RelativeLayout are placed according to the relations between the elements.
RelativeLayout may be more complicated to set up, when compared with LinearLayout, 
because we need to carefully specify the relations between the elements to achieve the desired layout.





//// 5. Try to explain the benefits of ConstraintLayout. Why you should use it?
ConstraintLayout is a versatile layout. We can use ConstraintLayout in a variety of situations, especially where we need to set up a complicated layout,
because we can use `Design` in Android Studio to configure the ConstraintLayout with ease.
