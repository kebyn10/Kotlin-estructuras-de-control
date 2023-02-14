
fun main(){

    /* requiriendo los datos al usuario */
    println("ingrese su nombre")
    val nombre=readLine().toString()

    println("ingrese el nombre de la materia")
    val materia=readLine().toString()

    println("ingrese la nota 1: ")
    val nota1=readLine()!!.toFloat()

    println("ingrese la nota 2: ")
    val nota2=readLine()!!.toFloat()

    println("ingrese la nota 3: ")
    val nota3=readLine()!!.toFloat()
/*sacando el promedio */
    val promedio=(nota1+nota2+nota3)/3

/*validar con una condicional doble */
if(promedio>=3.5){
    println("El estudiante aprobo $nombre GANO la matria $materia")
}else{
     println("El estudiante aprobo $nombre PERDIO la matria $materia")
}

}