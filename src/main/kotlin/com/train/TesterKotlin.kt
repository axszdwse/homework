package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner=Scanner(System.`in`)
    print("Please enter number of tickets:")
    var ticket=scanner.nextInt()
    print("How many round-trip tickets:")
    var round=scanner.nextInt()
    var tester=TesterKotlin(ticket,round)
    tester.print()
}

class TesterKotlin(var tickets:Int,var round:Int){
    fun print(){
        var total=(round*2000*9/10)+(tickets-round)*1000
        print("Total tickets:"+tickets+"\n")
        print("Round-trip:"+round+"\n")
        print("Total:"+total)
    }
}