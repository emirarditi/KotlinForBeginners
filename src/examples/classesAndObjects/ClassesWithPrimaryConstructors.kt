package examples.classesAndObjects

/**
 * Created by emirarditi on 02.07.2016.
 */

/*
    Kotlin classes have different sytnax from Java when it comes to constructors.
    You can implement classes with basic constructors in lots of different ways
    When you create a constructor, you HAVE TO DEFINE the type of the parameter
    Btw primary constructor is the paranthesis right next to the name, which comes before the {
 */

class HumanWithFieldParameterConstructor(var firstName : String){

}

class HumanWithConstructorKeyword constructor(firstName : String){
    var firstName = firstName; //properties always have to be initialized due to null safeties of Kotlin.
}

/*
    If the primary constructor does not have any annotations or visibility modifiers, you don't have to use the constructor
    keyword.
 */

class HumanWithConstructorAndAField(firstName : String){
    var firstName = firstName;
}

/*
    All of these classes does the exact same thing, just in a different syntax/way
 */
