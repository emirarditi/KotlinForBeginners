package examples.classesAndObjects

/**
 * Created by emirarditi on 04.07.2016.
 */

/*
    In Kotlin, you can declare a single primary constructor but multiple secondary constructors. If a class
    contains a primary constructor, all of the secondary constructors must call the primary constructor directly
    or indirectly(by calling a secondary constructor that calls the primary or etc. I will first implement a class
    without a primary constructor but with a secondary constructor, then I will create a class with primary constructor
    and a secondary constructor. Btw primary constructor is the paraathesis thingy right next to the class name before
     the {
     Also another note, you can't declare a field inside the secondary constructor like you did in the primary. You have
     to define it as a parameter and equate to a var/val just like you do in java
 */

class HumanWithhoutPrimaryConstructor{
    var humanName : String = "";
    var humanAge : Int = 0;
    constructor(name : String, age : Int){
        humanName = name;
        humanAge = age;
    }
}

class HumanWithPrimaryAndSecondaryConstructor(name : String, age : Int){
    var humanName : String = name;
    var humanAge : Int = age;
    var humanGender : String = "";
    constructor(name : String, age: Int, gender : String) : this(name, age){
        humanGender = gender;
    }
}

/*
    As you can see, I called the primary constructor by calling 'this' and passing the parameters needed.
 */