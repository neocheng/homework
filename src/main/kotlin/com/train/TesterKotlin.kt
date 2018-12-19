package com.train

import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
//    TicketKotlin().getTotal()
    BoxTesterKt().boxInit()
}

class TicketKotlin {
    fun getTotal() {
        println("*** This Kotlin ***")
        println("Please enter number of tickets:")
        val iTickets = Scanner(System.`in`).nextInt()
        if (iTickets == -1)
            exitProcess(0)
        println("Please enter number of tickets:")
        val iRoundTtrip = Scanner(System.`in`).nextInt()

        if (iTickets == 0 || iRoundTtrip > iTickets) {
            showAgain()
        } else {
            println("Total tickets: $iTickets")
            println("Round-trip: $iRoundTtrip")
            println("Total: " + getiTotalPrice(iTickets, iRoundTtrip))
            getTotal()
        }
    }

    fun getiTotalPrice(tickets: Int, roundTrip: Int): Int =
        ((tickets - roundTrip) * 1000) + ((roundTrip * 9 * 2000) / 10)

    fun showAgain() {
        println("*** error, please enter again ***")
        getTotal()
    }
}

class BoxTesterKt {
    fun boxInit() {
        println("*** This Kotlin ***")
        println("Please enter object's length: ")
        val fLength = Scanner(System.`in`).nextFloat()

        println("Please enter object's width: ")
        val fWidth = Scanner(System.`in`).nextFloat()

        println("Please enter object's height: ")
        val iHeight = Scanner(System.`in`).nextInt()

        if (Box3kt().validate(fLength, fWidth, iHeight))
            println("Box3")
        else if (Box5kt().validate(fLength, fWidth, iHeight))
            println("Box5")
        else
            println("*** The box does not match ***")
    }

}