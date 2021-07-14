fun operacao(a: Int, b: Int, c: String) {
/*
     when (c){
        "Soma" -> return a + b
        "Subtração" -> {
            return a + b
        }
        else -> {
            println("operação incorreta")
            return 0
        }
    }
    */

    when {
        a > 0 && b > 0 -> {
            println("Variáveis maiores que zero")
        }
    }

    when {
        a in 1..99 && b > 0 -> {
            println("Século")
        }
    }

}


fun main() {
    operacao(a = 10, b = 10, c = "Soma")
    operacao(a = 10, b = 10, c = "Subtração")
}