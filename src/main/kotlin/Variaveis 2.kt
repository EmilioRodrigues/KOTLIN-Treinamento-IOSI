/*fun main() {
    val t:Int = 19
    val str:String = "Total"


    t++
    str+= " Perfeito"

    println("O numero é: ${t}")
    println("A frase é: ${str}")
}

// VAL indica uma variavel que não pode assumir valores diferentes daqueles declarados
// VAR indica variavel que pode assumir valores diferentes e acordo com o algoritmo.
// no caso acima o programa retorna erro.

// mas alterando de VAL para VAR o programa executa normalmente.*/

fun main() {
    var t:Int = 19
    var str:String = "Total"


    t++ //contador incrementando 1 à variavel inicialmente declarada (19)
    str+= " Perfeito" //  Concatena as variaveis str com " Perfeito"

    println("O numero é: ${t}")
    println("A frase é: ${str}")


    var B:Boolean = true
    var C:Boolean = false
    println(B)
    println(C)
}
