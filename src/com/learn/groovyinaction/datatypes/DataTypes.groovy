package com.learn.groovyinaction.datatypes


import java.awt.Point
import java.awt.Rectangle

int secondPerYear = (60 * 60 * 24 * 365)
secondPerYear.toString()

assert 'abc' - 'c' == 'ab'

static Object readFromConsole(){
    return new Object()
}

//static because of the String type marker
//exact equivalent of String greetingA = (String) readFromConsole(); in Java
String greetingA = readFromConsole()

//deemed dynamic
def greetingB = readFromConsole()

class MyPoint{
    public int x
    public int y

    MyPoint (int x, int y) {
        this.x = x
        this.y = y
    }

    MyPoint(){

    }
}

//Casting lists and maps to arbitrary classes
MyPoint myPointA = new MyPoint(0, 0)
MyPoint myPointB = [0, 0]
MyPoint myPointC = [x:0, y:0]
Point pointD = [x:0, y:0]

