fun main(){

    /* inicializar la variables */

    var opcion:Int
    var num1: Float
    var num2:Float

    /* iniciamos el ciclo */
    do{
        /*tomandolos datos */
        println("ingrese el primer numero")
        num1=readLine()!!.toFloat()
        println("ingrese el segundo numero")
        num2=readLine()!!.toFloat()
        /*presentando el menu */
        println("""
        1.sumar
        2.restar
        3.multiplicar
        4.dividir
        5.salir
        """)
        opcion=readLine()!!.toInt()
        /* escojiendo una opcion */
        when (opcion){
            1 -> println(" la suma es: ${num1+num2}")
            2 -> println(" la resta es: ${num1-num2}")
            3 -> println(" la multiplicacion es: ${num1*num2}")
            4 -> {
                if(num2<=0){
                    println("El numero no puede ser negativo o igual que cero")

                }else{
                   println(" la division es: ${num1/num2}")
                }
            }
            5 -> println("programa finalizado")
            else -> println("opcion inavalida")
        }
    }while(opcion != 5)

}