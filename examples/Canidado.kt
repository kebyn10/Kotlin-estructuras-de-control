fun  main(){
/*pedir datos */
    println("Ingrese su nombre")
    val nombre=readLine().toString()
    
    println("Ingrese el nombre de la materia")
    val materia=readLine().toString()

    println("ingrese la nota 1: ")
    val nota1=readLine()!!.toFloat()
/*condicional anidada */
/*validando si esta en el rango indicado */
    if(nota1>=0 && nota1<=5){
        println("ingrese la nota 2: ")
        val nota2=readLine()!!.toFloat()
        if(nota2>=0 && nota2<=5){
            println("ingrese lanota 3: ")
            val nota3=readLine()!!.toFloat()
            if(nota3>=0 && nota3<=5){
                /* sacando el promedio */
                val promedio=(nota1+nota2+nota3)/3
                if(promedio>=3.5){
                    println("el estudiante $nombre aprobo la materia $materia")
                }else{
                   println("el estudiante $nombre reprobo la materia $materia") 
                   if(promedio>=2.5){
                    println("Y puede recuperar")
                   }
                }
            }else{
                println("la nota se pasa del rango")
            }
        }else{
            println("la nota se pasa del rango")
        }
    }else{
        println("la nota se pasa del rango")
    }
}