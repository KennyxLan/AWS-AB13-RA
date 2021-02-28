// Q1's Answer:

    val id = 9527                  // (a) Correct.

    // var number : Int = 5.6      // (b) INCORRECT. "The floating-point literal does not conform to the expected type Int"

    var title = "Hello Kotlin!"    // (c) Correct.

    // val content : String = null // (d) INCORRECT. "Null can not be a value of a non-null type String."
                                   //     The statement would be correct if it is changed to:
                                   //     val content : String? = null

    val number : Double? = 556.6   // (e) Correct.

    // var list : List<String>? = listOf(null, null)     // (f) INCORRECT. "Type mismatch: inferred type is String? but String was expected."
                                                         //     The statement would be correct if it is changed to:
                                                         //     var list : List<String?>? = listOf(null, null)

    var list : List<String?>? = listOf("Wayne", "Chen")  // (g) Correct.

    // list.size                   // (h) INCORRECT. "Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type List<String?>?"
                                   //     The statement would be correct if it is changed to:
                                   //     list?.size   OR   list!!.size

    list?.size                     // (i) Correct.



// Q2's Answer:

    (c) "Your grace."
    /* Reason:
     *     Because the length of message is 39, which is in the range 1..39 , the corresponding statement
     *         println("Your grace.")
     *     is executed.
     */



// Q3's Answer:

    (d) val array = Array(6) { 1000.0.pow(it) }
    /* Reason:
     *     The statement correctly initializes 'array' to be an array of 'Doubles': 
     *       { 1000^0,
     *         1000^1,
     *         1000^2,
     *         1000^3,
     *         1000^4,
     *         1000^5, }
     */


