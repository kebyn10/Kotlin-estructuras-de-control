fun main(){
    /*inicializamos las variables */
    var cantidadEstudiantes:Int
    var sumerPromedios=0.0
    /* perdir los datos */
    println("ingrese la cantidad de estudiantes")
    cantidadEstudiantes=readLine()!!.toInt()

    /*usamos la estructura de control un ciclo for */
    for(i in 1..cantidadEstudiantes){
        println("ingrese el promedio del estudiante")
        var promedio=readLine()!!.toFloat()

        sumerPromedios +=promedio
    }

    var promedioTotal=sumerPromedios/cantidadEstudiantes
    println("el promedio de todos los promedios fue $promedioTotal")



}