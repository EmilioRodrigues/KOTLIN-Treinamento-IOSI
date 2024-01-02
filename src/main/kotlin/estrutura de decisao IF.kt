/* VERIFICAÇÃO SIMPLES DE CONDIÇÃO
fun main() {

    var idade: Int = 8
    if (idade>=18){
        println("Maior de idade.")
    }else{
        println("Menor de idade.")
    }
}
*/


/* AMPLIANDO AS CONDIÇÕES DE VERIFICAÇÃO
Classificando as pessoas através da faixa etaria

condições:
Idoso >=60 anos |
Adulto entre 21 e 59 anos |
Jovem entre 13 e 20 anos |
Criança abaixo de 12 anos
*/

fun main() {
    var idade: Int = 51
    if (idade >=60){
        println("Essa pessoa é idosa.")
    } else if (idade >=21 && idade <=59){
        println("Essa pessoa é adulta.")
    } else if (idade>=13 && idade <=20){
        println("Essa pessoa é jovem.")
    } else{
        println("Essa pessoa é criança.")
    }
}

