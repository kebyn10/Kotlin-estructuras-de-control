fun main(){
    /* creamos el menu */
    var menu="""
    1.saludar
    2.pedir Nombrede una persona
    3.sumar 2 numeros
    ingrese una opcion: 
     """
     /*mostramos el menu */
     print(menu)
/* utlizar el when */
var opcion=readLine()?.toInt()

when(opcion) {
    1 -> print("Hola")
    2 -> {println("ingrese su nombre")
        val name=readLine().toString()
        println(name)
        }
    3 -> {
        println("ingrese el numero 1: ")
        val num1=readLine()?.toInt()
        println("ingrese el numero 2: ")
        val num2=readLine()?.toInt()
        val suma=num1!!+num2!!
        println(suma)
    }
    else -> println("opcion  invalida")
}

}