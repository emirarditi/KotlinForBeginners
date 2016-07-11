package examples.classesAndObjects

/**
 * Created by emirarditi on 11.07.2016.
 */

/*
    Sealed classes are similar to Enums. The difference is that you can use the properties
    of defined classes
 */

sealed class Expr {
    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()
}

fun eval(expr: Expr): Double = when(expr) {
    is Expr.Const -> expr.number
    is Expr.Sum -> eval(expr.e1) + eval(expr.e2)
    Expr.NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
}