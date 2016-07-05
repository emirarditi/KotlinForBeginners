package examples.classesAndObjects.Inheritance

/**
 * Created by emirarditi on 05.07.2016.
 */

/*
    If you only inherit a single class, you will never be in a situation that I am about to explain. But if you plan
    to create a very complex object which inherits a class and an interface, you might have to face with this problem.
    Kotlin also doesn't support multiple inheritance(just like java) but it supports interfaces(just like java again).
    Also, you can inherit multiple interfaces in Kotlin but not multiple classes.
 */

open class Object{
    open fun sound(){println("Vnnnnn")}
}

interface Clickable{
    fun sound(){println("Clickkkk")}
}

interface Movable{

}

class myObject : Object(), Clickable, Movable{
    override fun sound() {
        super<Clickable>.sound() //if inherit more than one 'thing'(class,interface), you have to clarify which super you are calling.
        super<Object>.sound()
    }
}