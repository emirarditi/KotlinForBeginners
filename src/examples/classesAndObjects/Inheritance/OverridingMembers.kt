package examples.classesAndObjects.Inheritance

/**
 * Created by emirarditi on 05.07.2016.
 */

/*
    just like the classes have to use the word open in order to be inheritable, the method or the field has to use the open
    keyword too. If you don't declare it as open, you can't change it's properties. Also when you override an open function
    or field, you have the use the override keyword.
 */

open class Animal{
    open fun eat() {};
}

class Dog : Animal(){
    override fun eat() {
        println("I eat from my dog plate")
    }
}

/*
    Quick note, as you may have realized, you have to use the paranthesis while extending the class because that is the
    syntax for calling the default primary constructor
 */

class Cat : Animal(){
    override fun eat() {
        println("I eat from my cat plate")
    }
}

fun main(args: Array<String>) {
    var cat : Cat = Cat();
    var dog : Dog = Dog();
    cat.eat();
    dog.eat();
}

/*
    We created 2 different implementations of the eat method for 2 different classes that extends the Animal class.
 */



