fun main(args: Array<String>) {
    println("Для одномерных массивов введите 1 для двумерных введите 2")
    val cont = readLine()!!.toInt()
    if (cont == 1) {
        mas1()
    } else if (cont == 2) {
        mas2()
    } else {
        print("вы ошиблись")
    }
}

fun mas1() {
    val randomGrades = IntArray(10) { (1..5).random() }
    val fours = randomGrades.count { it == 4 }
    val fives = randomGrades.count { it == 5 }
    println("Массив оценок: ${randomGrades.contentToString()}")
    println ("Сумма четверок и пятерок: ${fours + fives}")
}

fun mas2() {
    val rows = 5
    val cols = 5
    val array = Array(rows) { IntArray(cols) }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = (Math.random() * 100).toInt()
        }
    }
    println("Массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols)
        { print("${array[i][j]} ") }
        println ()
    }
    val evenElementsInThirdColumn = array.map { it[2] }.filter { it % 2 == 0 }
    val averageOfEvenElements = evenElementsInThirdColumn.average()
    println("Среднее арифметическое четных элементов третьего столбца: $averageOfEvenElements")
    val fourthRow = array[3]
    val elementsMultipleOfThree = fourthRow.filter { it % 3 == 0 }
    val averageOfElementsMultipleOfThree =
        elementsMultipleOfThree.average()
    println ("Среднее арифметическое элементов четвертой строки, кратных трем: $averageOfElementsMultipleOfThree")
}