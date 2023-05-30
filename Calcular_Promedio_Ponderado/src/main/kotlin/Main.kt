import java.util.*

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`)

    println("¿Cuántas materias quieres calcular?")
    val numMaterias = input.nextInt()
    input.nextLine()

    var sumNotaPorCreditos = 0.0
    var sumCreditos = 0

    for (i in 1..numMaterias)
    {
        println("Por favor ingresa el nombre de la materia $i:")
        val materia = input.nextLine()

        println("Por favor ingresa la nota final en la materia '$materia':")
        val nota = input.nextDouble()
        input.nextLine()  // consume el '\n' que no consumió nextDouble()

        println("Por favor ingresa cuántos créditos vale la materia '$materia':")
        val creditos = input.nextInt()
        input.nextLine()  // consume el '\n' que no consumió nextInt()

        sumNotaPorCreditos += nota * creditos
        sumCreditos += creditos
    }

    val promedioPonderado = sumNotaPorCreditos / sumCreditos
    println("El promedio ponderado de las materias es: $promedioPonderado")
}

