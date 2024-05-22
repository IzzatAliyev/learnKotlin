package com.iua

import com.iua.classes.*

/*
    Start point
*/
const val surName = "Aliyev"
val numbers = 1..5
val arrayNumbers = arrayOf("0013", "1234", "q3321", "213324")

//const val numbers = 1..5 !!error!! only primitive can be const
fun main() {
    var daten = Daten("data", 200F)
    println(daten)
}

//var createPerson: () -> Persons = { Persons()}

val sum = {x:Int, y:Int -> x + y}
val printer = {message: String -> println(message)} // lambda
var printName: ()->Unit = { println("helli") }; // lambda is always in {}
var printAge = fun(a:Int)= println(a) // anonym method

fun operation(num: Int): (Int, Int) -> Int {
    when (num) {
        1 -> return ::mySum
        else -> return ::mySum
    }
}

fun operation(x: Int, y: Int, operation: (Int, Int) -> Int) {
    operation(x, y)
}

fun mySum(x: Int, y: Int): Int {
    println(x + y)
    return x + y
}

val messagePrint: () -> Unit = ::ds

fun sum2(x: Int): Unit = println(x + x)
fun sum2(x: Double): Unit = println(x + x)
fun sum2(x: Float): Unit = println(x + x)
//fun sum2(x: Float): Float = x+x !!error!! overload is params

private fun ds(): Unit {
    println("Hello world")
}

fun sumInt(vararg values: Int) {
    println(values.sum())
}

fun goThroughArray() {
    val nums = Array(3) { 5 }
    nums.forEach { x -> println(x) }
    for (number in arrayNumbers) {
        println(number)
    }
}

fun printName(name: String = "Izzay", age: Int = 20) {
    println("$name and $age")
}

fun rangeReverse() {
    for (num in 100 downTo 0 step 5) {
        println(num)
    }

    for (num in 1..<100 step 10) {
        println(num)
    }

    for (letter in 'a'..'z') {
        println(letter)
    }
}

fun whenReturn(num: Int) {
    var result = when (num) {
        1 -> "Red"
        2 -> "Blue"
        3 -> "Black"
        else -> "Defaule"
    }

    println(result)
}

fun whenIf(num: Int) {
    when {
        (num == 1) -> println("is 1")
        (num == 2) -> println("is 2")
        (num == 3) -> println("is 3")
        else -> println("default")
    }
}

fun whenTest(number: Int) {
    when (number) {
        1 -> println("is 1")
        2 -> {
            println("is 2")
            println("yeah its 2")
        }

        3 -> println("is 3")
        4 -> println("is 4")
        5 -> println("is 5")
        in 6..10 -> println("from 6 to 10")
        100, 200 -> println("100 or 200")
        5 * 5 -> println("is sum of 5*5")
        else -> println("default")
    }
}

fun shortIf(numbers: IntRange) {
    if (4 in numbers) println("is there") else println("nothing")
}

fun checkIfRange(numbers: IntRange, num: Int) {
    if (num in numbers) {
        println("there is $num")
    } else {
        println("there is no $num")
    }
}

fun foreachRangeWithIf(numbers: IntRange) {
    for (x in numbers) {
        if (x == 4) {
            println("$x is 4")
        }

        println(x)
    }
}

fun foreachRange(numbers: IntRange) {
    for (x in numbers) {
        println(x)
    }
}

fun readPrint() {
    print("Enter the name: ")
    val name = readln()
    println("your name is $name")
}

fun getSomeValues() {
    //    const val surName = "Aliyev" !!error!! cannot be local const
    var userName: String = "Izzat"
    userName = "Kiril"
    val userAge: Int = 21
    //    userAge = 20 !!error!! because val is immutable
    var universal: Any = "name"
    universal = 5
    println("Helli $userName $surName with age $userAge and universal variable $universal")
}