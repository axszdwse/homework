package com.train

import java.util.*

fun main(args: Array<String>) {
    var tickets=0
    while (tickets!=-1) {
        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets:")
        tickets = scanner.nextInt()
        if(tickets==-1){
            break
        }
        print("How many round-trip tickets:")
        var round = scanner.nextInt()
        var tester = TesterKotlin(tickets, round)
        tester.print()
    }
}

class TesterKotlin(var tickets:Int,var round:Int){
    fun print(){
        var total=(round*2000*9/10)+(tickets-round)*1000
        println("Total tickets:$tickets")
        println("Round-trip:$round")
        println("Total:$total")
    }
}