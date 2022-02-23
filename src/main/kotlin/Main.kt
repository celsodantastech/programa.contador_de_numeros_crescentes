fun main() {
    //Faça um programa que entre com três números e coloque em ordem crescente.
    println("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()
    println("Digite o terceiro número:" )
    val n3= readLine()!!.toInt()

    if (n1 > n3 && n1 > n2 && n2 > n3)
        println("a ordem crescente é $n3, $n2, $n1")
    else if (n1 > n3 && n1 > n2 && n3 > n2)
        println("a ordem crescente é $n2, $n3, $n1")

    else if (n3 > n2 && n3 > n1 && n2 > n1)
        println("a ordem crescente é $n1, $n2, $n3")
    else if (n3 > n2 && n3 > n1 && n1 > n2)
        println("a ordem crescente é $n2, $n1, $n3")

    else if (n2 > n3 && n2 > n1 && n3 > n1)
        println("a ordem crescente é $n1, $n3, $n2")
    else{ (n2 > n3 && n2 > n1 && n1 > n3)
        println("a ordem crescente é $n3, $n1, $n2")
    }
}