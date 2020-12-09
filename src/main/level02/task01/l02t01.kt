package main.level02.task01

/* Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
Подсказка:
Нужно написать тело существующей функции min и исправить возвращаемое значение.
*/
fun min2(a:Int, b:Int){
    if (a < b && a != b){
        println("Минимальное число $a")
    } else if (b<a && a != b){
        println("Минимальное число $b")
    } else {
        println("Числа равны")
    }
}

fun min(a: Int, b:Int): Int {
    var m1 = 0
    if (a<b){
       m1 = a
   } else {
       m1 = b
   }
    return m1
}

fun main(){
    print("Введите первое число: ")
    var ina = readLine()
    var a = ina!!.toInt()
    print("Введите второе число: ")
    var inb = readLine()
    var b = inb!!.toInt()
    print("Введите третье число: ")
    var inc = readLine()
    var c = inc!!.toInt()
    print("Введите четвертое число: ")
    var ind = readLine()
    var d = inb!!.toInt()

    var m2 = min(a, b)
    var m3 = min(c, d)

    var out:Int
    if (m2 < m3){
        out = m2
    } else {
        out = m3
    }

    println("Наименьшее число $out")
  }