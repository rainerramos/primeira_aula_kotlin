fun media3(vararg notas: Float){

    if (notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas){
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }
}

fun <T> media(vararg valores: T){
    for (valor in valores){
        println(valor)
    }
}

fun main() {
    //media(10f, 8f)
   // media(1f, 5f, 4f, 7f)

    media(1, 4f, "", false, "", 'C')
}
