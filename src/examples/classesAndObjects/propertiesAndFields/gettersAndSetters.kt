package examples.classesAndObjects.propertiesAndFields

/**
 * Created by emirarditi on 20.07.2016.
 */

/*
    We have declared dozens of properties by now so I am not going to talk about the declaration of the properties here.
    But a quick reminder for you, the syntax of declaring is like the following:
    var <propertyName>: <PropertyType> [= <property_initializer>]
        [<getter>]
        [<setter>]
    We know that the declaration of property type and initializer is optional. Also we know that var is a open(changeable)
    field where val is a final field. When you first see the syntax, you may say that what are these getter and setter, I have
    never seen them before in this documentation. Well, you will see it know.
    First of all, getters and setters are optional in kotlin and that is the only pre-knowledge you need to know about them.
 */

var propertyExample1 = 5;

var varPropertyWithCustomGetter : Int = 4;
    get() = 5;

val valPropertyWithCustomGetter : Int
    get() = 10;

class Example1{
    var size = 3;
    val isEmpty: Boolean
        get() =  this.size == 0;
}

/*
    You can also use the get like the example above. Now we will implement custom setters. Keep in mind that the val properties
    cannot have setters since they are read only properties.
 */

var property : Int
get() = 12;
set(value){value*2;}

/*
    If you have both declared a getter and a setter, you don't have to initialize the var but otherwise, you have to initialize it.
 */



