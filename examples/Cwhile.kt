
fun main(){
    /*  inicializamos la variables*/
    var opcion:Int=0
    var num1:Float
    var num2:Float

    /*la estructura de control while */
    while(opcion !=5){
        println("ingrese el primer numero")
        num1=readLine()!!.toFloat()
        println("ingrese el segundo numero")
        num2=readLine()!!.toFloat()
        println("""
        1.sumar
        2.restar
        3.multiplicar
        4.dividir
        5.finalizar
        """)
        opcion=readLine()!!.toInt()
        when(opcion){
            1 -> println("la sumar es: ${num1+num2}")
            2 -> println("la resta es: ${num1-num2}")
            3 -> println("la multiplicacion es: ${num1*num2}")
            4 ->{
                if(num2<=0){
                    println("el segundo numero no puede ser menor o igual que cero")
                }else{
                    println("la divicion es: ${num1/num2}")}
                }
            5 -> println("fin del programa")
            else -> println("opcion invalida")
            }

        }
    }
