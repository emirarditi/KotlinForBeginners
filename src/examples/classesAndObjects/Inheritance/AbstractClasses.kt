package examples.classesAndObjects.Inheritance

/**
 * Created by emirarditi on 11.07.2016.
 */

/*
    In Kotlin, abstract classes are similar to Java abstract classes. Abstract classes are open(Inheritable) by default,
    you can define open and non-open properties inside and you can not create instances of it. But abstract classes have constructors
    this is needed in order to specify a property when inheriting the class
 */

abstract class AbstractClass(){
    fun notOpenFunction(){

    }

    open fun openFunction(){

    }
}

class OverridingClass : AbstractClass(){
    override fun openFunction() {

    }
}