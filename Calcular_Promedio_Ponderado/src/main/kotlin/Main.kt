import java.util.*

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`)

    println("¿Cuántas materias quieres calcular?")
    val numMaterias = input.nextInt()
    input.nextLine()  // consume el '\n' que no consumió nextInt()

    var sumNotaPorCreditos = 0.0
    var sumCreditos = 0

    val materias = mutableListOf<String>()
    val notas = mutableListOf<Double>()
    val creditos = mutableListOf<Int>()

    for (i in 1..numMaterias)
    {
        println("Por favor ingresa el nombre de la materia $i:")
        val materia = input.nextLine()
        materias.add(materia)

        println("Por favor ingresa la nota final en la materia '$materia':")
        val nota = input.nextDouble()
        input.nextLine()  // consume el '\n' que no consumió nextDouble()
        notas.add(nota)

        println("Por favor ingresa cuántos créditos vale la materia '$materia':")
        val credito = input.nextInt()
        input.nextLine()  // consume el '\n' que no consumió nextInt()
        creditos.add(credito)

        sumNotaPorCreditos += nota * credito
        sumCreditos += credito
    }

    println("\nTabla de Materias, Notas y Créditos:")
    for (i in 0 until numMaterias)
    {
        println("${materias[i]}: Nota = ${notas[i]}, Créditos = ${creditos[i]}")
    }

    val promedioPonderado = sumNotaPorCreditos / sumCreditos
    println("\nEl promedio ponderado de las materias es: $promedioPonderado")
}


