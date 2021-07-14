fun calculaBonus(cargo: String, salario: Float) : Float {

    return if (cargo == "Coordenador"){
         salario * 0.2f
    } else if (cargo == "gerente junior") {
        salario * 0.5f
    } else {
        salario * 2
    }

}

fun maiorDeIdade(idade: Int) : Boolean {
    return idade >= 18
}

fun main() {

    println(calculaBonus(cargo = "Coordenador", salario = 1000f))
    println(calculaBonus(cargo = "gerente junior", salario = 1000f))
    println(calculaBonus(cargo = "Gerente senior", salario = 1000f))

}