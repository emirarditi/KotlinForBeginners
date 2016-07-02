package examples.statements

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*Kotlin and java have some similarities and differences regarding the if statements. The simple if syntax
    is same as java
    */
    var a : Int = 5;
    if(a == 5){
        println("true");
    }
    else if(a == 4){
        println("Nooo");
    }
    else{
        println("Else is else.")
    }
    /*But that is not it for Kotlin!
        In kotlin, you can use if for a bigger purpose. You can assign a value and execute a function.
        The last line equals the value and the rest is just what you want to execute or do.
        It doesn't sound very clear I know so let's check the code below to understand it better.
     */
    var b : Int = 10;
    var c : Int = 20;
    var max : Int = if(b > c){
        println("I have  chosen B");
        println("Multiple lines are supported too");
        b //max is B!
    }
    else{
        print("I have chosen the double of C");
        c*2 //max is C*2
    }
    println(max); //Lets check the value by printing.
}