package examples.statements

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*First of all, I would like to state that this will be a relatively long file, because there are lots of different
    use cases for when in Kotlin. Speaking of cases, Kotlin replace the switch/case flow in Java with when,
    but with a lot of different features. First I will show you the most basic when statement in Kotlin.
     */
    val x : Int = 5;
    when(x){
        1 -> println("x is 1");
        2 -> println("x is 2");
        3 -> println("x is 3");
        4 -> println("x is 4");
        5 -> println("x is 5");
        else -> println("x is something else");
    }
    /*
        Notice that there are no break statements. But when also stops when it finds a matching property.
     */
    
    when(x){
        4 -> {
            println("You can also execute multiple lines using blocks.");
            println("Kotlin is fun and my number is 4");
        }
        
        5 -> println("My number is 5");
    }
    /*
        You don't have to define the else statement, and nothing wrong happens if the statement doesn't match any
        provided cases.
     */

    when(x){
        1, 2, 3, 4, 5 -> println("I have a number");
        /*
            You can also assign multiple values to the same case.
         */
    }

        /*
            You can also give ranges using the in statement. You can define a range and give inside the when too.
         */
    val validNumbers : IntRange = 1..5;
    when(x){
        in 1..5 -> print("x is in the range");
        in validNumbers -> print("x is valid");
    }

    /*
        You can also check for type inside the when loop
     */

    val exampleSomething : String = when(x){ //*TODO* check issue 1: can't use is String(research for it)
        is Int -> "x is a number";
        else -> "It is something else";
    }

    /*
        Finally, you can even use when without giving a 'key' It can be used like if/else if/else control flow
     */

    when{
        x.equals(5) -> println("true");
        else -> println("false");
    }
}