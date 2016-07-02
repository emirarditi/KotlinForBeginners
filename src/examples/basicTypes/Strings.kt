package examples.basicTypes

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*
        Strings are very different in syntax when compared to Java in Kotlin. For example, in Java, you access the characters
        in string like string.charAt(i) while in Kotlin, Strings are threated like real character sequences. You access a char
        with [] just like you do in an array.
     */

    var string = "Hello";
    val character = string[0];
    /*
        Kotlin strings are also immutable so you can add chars to the start or finish, but you can't modify the existing string's chars.
        You can also iterate a string using for loops.
     */

    /*
        Another important note is that you don't use + sign to add a field inside a string,
        you use the $ sign to call a var inside a string, and if you want do an operation on that field, like
        integer.toString(), you have to use in the following context ${integer.toString()}
     */

    for((index,chars) in string.withIndex()){
        println("The char number ${index+1} has the value $chars");
    }
}