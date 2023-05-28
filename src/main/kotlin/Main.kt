fun main(args: Array<String>) {
    operation()
}
fun calculator(a: Double, b: Double, operator: Char): Double {
    return when (operator) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> throw IllegalArgumentException("Неподдерживаемый оператор: $operator")
    }
}

fun operation() {
    val a = 10.0
    val b = 5.0
    val operator = '+'

    val result = calculator(a, b, operator)
    println("______________________Результат: $result")
}