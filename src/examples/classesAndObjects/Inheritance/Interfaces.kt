package examples.classesAndObjects.Inheritance

/**
 * Created by emirarditi on 05.07.2016.
 */

/*
    If you have any past experience with C# and/or Java, you might be familiar with the term Interface.
    If you have not worked with interfaces before, you might want to listen this part carefully. The main difference
    between a class and an interface is that when you extend a class with an interface, you can inherit multiple interfaces
    to a single class. Another difference is that you can not create instances of interfaces. In an abstract class, you
    need to define functions as open in order to make it overrideable, while in interfaces, the fun's are open by default.
 */

interface MovableInterface{
    fun sound(){
        //body is optional
    }

    fun click();
}

interface SaveableInterface{
    fun name();
}

class GameObjectClass() : MovableInterface, SaveableInterface{ //if the funs in the inherited interface have no body, you have to override it
    override fun click(){

    }

    override fun name(){

    }
}