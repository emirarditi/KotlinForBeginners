package examples.classesAndObjects.Constructors

/**
 * Created by emirarditi on 04.07.2016.
 */

/*
    In Kotlin, as you may have presumed, you can't execute any functions inside the primary constructor.
    Btw primary constructor is the paranthesis right next to the name, which comes before the {
    If you want to execute something when you instantiate a class, you can use the init keyword.
 */

class HumanWithInit(var firstName : String){
    init{
        println("I am alive!!! My name is: $firstName");

    }
}

/*
    You can see instantiation below.
    As you can see, the main function is not inside a class. In Kotlin, you can't run the main method
    inside a class, so you have to write it outside.
 */

fun main(args: Array<String>) {
    var helloExample1 : HumanWithInit = HumanWithInit("Matt");
}

/*,
    If you run this file, you will see that the desired output(print inside the init) is in the console.
    Another feature of Kotlin(you will see this in a more detailed way afterwards) is that you don't use the
    new keyword in Kotlinf
 */