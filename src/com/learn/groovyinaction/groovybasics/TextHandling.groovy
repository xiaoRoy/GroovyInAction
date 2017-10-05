package com.learn.groovyinaction.groovybasics

//GString
def nickName = 'Magneto'
def book = 'Groovy In Action, 2nd ed.'
assert "$nickName is $book" == 'Magneto is Groovy In Action, 2nd ed.'

//Number is Object
def x = 2
def y = 3
assert x + y == 5
assert x.plus(y) == 5
assert x instanceof Integer

//Array
def romanNumber = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert romanNumber[4] == 'IV'
romanNumber[8] = 'VIII'
assert romanNumber.size() == 9
romanNumber[10] = 'X'
assert romanNumber.size() == 11

//Map
//define
def httpResponseCode = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BAD REQUEST'
]
//access
assert httpResponseCode[200] == 'OK'
//modify
httpResponseCode[500] = 'INTERNAL SERVER ERROR'
assert httpResponseCode.size() == 4


//Range
def numberRange = 1..10
assert numberRange.contains(2)
assert !numberRange.contains(15)
assert numberRange.size() == 10
assert numberRange.from == 1
assert numberRange.to == 10
assert numberRange.reverse() == 10..1
