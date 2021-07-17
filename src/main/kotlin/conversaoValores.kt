import java.lang.NumberFormatException

fun main() {

    try {
        println("shsh".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número!")
    } catch (e: Exception) {
        println("Algo de errado ocorreu")
    } finally {
        println("akdighaikd")
        println("akdighaikd")
    }


}