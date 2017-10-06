package com.learn.groovyinaction.groovybasics
//Closure
def numbers = [1, 2, 3, 4, 5]
numbers.each {number -> println(number)}


def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople) {
    guestNumber ->
        def clinksWithGuest = guestNumber - 1
        totalClinks += clinksWithGuest
}
println totalClinks
assert totalClinks == (partyPeople * (partyPeople-1)) / 2


class Apple{
    static float calculatePrice(float weight, float price){
        return weight * price;
    }
}

def totalPrice = Apple.calculatePrice 3.2f, 5.99f
println totalPrice


//2.3.10 Groovy control structures

if(null){
    println 'Never reach'
} else {
    println 'In conditional, null is false.'
}

def emptyString = ''
if(emptyString){
    println 'Never reach'
} else {
    println 'In conditional, empty string is false.'
}
def emptyList = []
if(null){
    println 'Never reach'
} else {
    println 'In conditional, empty list is false.'
}

//the for in range
def result = 0
for(index in 1..10){
    result += index
}
println result

//the for in list
def numberList = [1, 2, 3, 4, 5]
for (number in numberList){
    println number
}
