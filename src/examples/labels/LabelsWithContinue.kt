package examples.labels

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*
        Imagine that you have a nested for loop and you check a condition inside the second loop, but want to skip the
        first loop accordingly too. You can either assign a boolean and write 2 continues, one inside the first and one inside
        the other, or you can just use a label and skip the desired loop.
     */

    val array : IntArray = intArrayOf(1,2,3,4,5) ;
    var someNumber = 5;
    arrayFor@ for((index, value) in array.withIndex()){
        println("Hello from value $value");
        while(someNumber >= 0){
            println("$someNumber is a funny number");
            someNumber--;
            if(someNumber == 0){
                continue@arrayFor;
            }
        }
        println("Goodbye from index $index");
    }
    /*
        If you run the program, you will notice that the console didn't printed out the first goodbye because the continue inside
        the while skipped the for outside.
     */
}