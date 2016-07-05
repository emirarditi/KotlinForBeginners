package examples.classesAndObjects.Inheritance

/**
 * Created by emirarditi on 05.07.2016.
 */

/*
    In Java, all classes are extendable or inheritable by default. If you write final right next to the class declaration,
    the class, you can't extend that class. In Kotlin, this proccess works vice-versa. All classes are final, or non-inheritable
    by default, and if you want them to be inheritable, you have to declare it as open. If a class does not inherit any other class,
    it inherits the Any class by default.
 */

open class Human(gender: String);

class Male() : Human("male");

class Female() : Human("female");

/*
    In order to inherit a class, you have to satisfy it's constructor.
 */

open class Animals{
    constructor(gender : String, type : String);
}

class myAnimal : Animals{
    constructor(gender : String) : super(gender, "myAnimal");
}

/*
    for the primary constructor, you call the constructor from the class name nut for the secondary constructors, you have
    to declare it by using the super keyword.
 */