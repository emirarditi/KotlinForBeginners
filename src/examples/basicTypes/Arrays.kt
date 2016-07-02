package examples.basicTypes

/**
 * Created by emirarditi on 02.07.2016.
 */

fun main(args: Array<String>) {
    /*
        Arrays in Kotlin are very different in syntax, but similar in functionality when you compared to Java
     */

    /*
        Below, I will write 4 examples about how to instantiate an array.The 3rd one is half lambda and the last one is with lamba so if you don't know
        what lambda is, check the lamba documentation.
     */

    val javaLikeArrayWithSize = IntArray(5); //creates an array with a size of 5 and all the fields are 0
    javaLikeArrayWithSize[0] = 1;
    javaLikeArrayWithSize[1] = 2;
    javaLikeArrayWithSize[2] = 3;
    javaLikeArrayWithSize[3] = 4;
    javaLikeArrayWithSize[4] = 5;
    val arrayWithValues = intArrayOf(1, 2, 3, 4, 5); //values assigned like java int[] a = {1,2,3,4,5}
    var i = 1;
    val arrayWithDynamicValuesAndSize = Array<Int>(5) { i++ };
    val arraysWithSizeAndLambda = Array<Int>(5, { k -> k + 1 });
    /*
        IntArray class and Array class has no inheritance between each other but they both have similar set of
        array operation methods;
     */

    /*
        Array operations
            Arrays have the same operations in Java. [] is used for get and set
     */
    javaLikeArrayWithSize[0] = javaLikeArrayWithSize[1] + javaLikeArrayWithSize[2];
    /*
        you can check how to go through an array with for loop with the for loop documentation
     */
}