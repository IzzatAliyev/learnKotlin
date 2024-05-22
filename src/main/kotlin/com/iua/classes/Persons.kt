package com.iua.classes

class Persons(private var name: String, private var age: Int, birthDay: String) {
    private var city: String = "London"
    var birthDay: String = birthDay;

    constructor(name: String, age: Int, birthDay: String, book: String): this(name, age, birthDay){

    }

    fun getCity(): String
    {
        return this.city
    }

    override fun toString(): String {
        return "Person: { name = $name }"
    }
}