import java.util.Scanner

const val standardPrice = 10
const val discountPrice = 8
const val bravo = 4
const val alpha = 5

fun main(args: Array<String>) {

    // write your code here
    println("Cinema:")
    println("  1 2 3 4 5 6 7 8")
    println("1 S S S S S S S S")
    println("2 S S S S S S S S")
    println("3 S S S S S S S S")
    println("4 S S S S S S S S")
    println("5 S S S S S S S S")
    println("6 S S S S S S S S")
    println("7 S S S S S S S S")



println("Enter the number of rows: ")
    var rows = readln().toInt()
    println("Enter the number of seats in each row: ")
    var seats = readln().toInt()

    var frontSeatPrice = 0
    var backSeatPrice = 0

    fun income(): Int {
        if(rows * seats < 60){
            seats *=  rows *  10
            return seats
        } else if(rows * seats > 60){
            frontSeatPrice =  (rows/2) * seats * standardPrice
            backSeatPrice =  (rows - (rows/2)) * seats * discountPrice
            return frontSeatPrice + backSeatPrice
        }
        else{
            seats *=  rows *  10
            return seats
        }



    }
    println("Total income: ")
    println("$" + income())

}





