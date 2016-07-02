package examples.loops

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*
        Kotlin for loops are relatively closer to python loops. It does not have the syntax for(int i = 0; i < 5; ++)
        Instead, it iterates through something. See the example below
     */

    val collection : Collection<String> = listOf("a", "b", "c");
    for(item: String in collection){
        println(item);
    }

    /*
        You can iterate through the indices of an array with the following syntax
     */

    val array : IntArray = intArrayOf(4,2,3);
    for(number in array.indices){
        println("index $number has the value ${array[number]}");
    }

    /*
        alternatively, you can iterate through an array, by threating the array like a map
     */

    for((index, value) in array.withIndex()){
        println("index $index has the value $value");
    }
}
