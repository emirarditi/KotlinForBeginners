package examples.classesAndObjects

/**
 * Created by emirarditi on 02.07.2016.
 */

/*
    Kotlin classes have different sytnax from Java when it comes to constructors.
    You can implement classes with basic constructors in lots of different way
    When you create a constructor, you HAVE TO DEFINE the type of the parameter
 */

class HumanWithFieldParameterConstructor(var firstName : String){

}

class HumanWithConstructorKeyword constructor(firstName : String){
    var firstName = firstName;
}

/*
    If the primary constructor does not have any annotations or visibility modifiers, you don't have to use the constructor
    keyword.
 */

class HumanWithConstructorAndAField(firstName : String){
    var firstName = firstName;
}
