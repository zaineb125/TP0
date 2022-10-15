package com.gl4.tp

import kotlin.math.abs


class Point(var x: Int,var y: Int){
}

fun distance(p:Point,q:Point):Int{
    return abs(p.x-q.x)+abs(p.y-q.y)
}

class Rectangle (var p :Point=Point(0,0) , var q :Point=Point(1,1)){
    override fun toString():String{
        return "p=$p q=$q"
    }
    fun surface():Int{
        return abs(q.x - p.x)*abs(q.y - p.y)
    }
}

fun main(argv : Array<String> ){
    print("Hello")

    var rectangles = arrayOf(Rectangle(),Rectangle(p=Point(2,3)), Rectangle(Point(1,3), Point(4,1)), Rectangle(q=Point(2,2)))

    for(i in 0 .. rectangles.size-1){
        println( "la surface de rectangle ${i} est ${rectangles[i].surface()} ")
    }
}