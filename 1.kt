//      1

//import kotlin.math.sqrt
//
//fun main(){
//    println("Введите площадь круга: ")
//    var a = readLine()!!.toDouble()
//    println("Введите площадь квадрата: ")
//    var b = readLine()!!.toDouble()
//
//    var r = sqrt(a/3.14)
//    var c = sqrt(b)
//
////    println(r)
////    println(c)
//    println("$r $c")
//    if(r < b){
//        println("Круг поместится")
//    }
//    else{
//        println("Круг не поместится")
//    }
//
//}

//          2

//fun main() {
//    println("Введите двузначное число: ")
//    var a = readLine()!!.toInt()
//    var s:Int = a*a
//    var z:Int = a/10
//    var x:Int = a%10
//    var c:Int = 4*(z*z*z+x*x*x)
//
//    if(s==c){
//        println("Равен")
//    }
//    else{
//        println("Не равен")
//    }
//}

//     3
//import kotlin.math.sqrt
//fun main(){
//    print("Введите день года")
//    var a = readLine()!!.toInt()
//    a = a%7
//    if(a == 1){
//        println("Понедельник")
//    }
//    else if(a == 2){
//        println("Вторник")
//    }
//    else if(a == 3){
//        println("Среда")
//    }
//    else if(a == 4){
//        println("Четверг")
//    }
//    else if(a == 5){
//        println("Пятница")
//    }
//    else if(a == 6){
//        println("Суббота")
//    }
//    else if(a == 0){
//        println("Воскресенье")
//    }
//}

//       4
//fun main(){
//    var a = readLine()!!.toInt()
//    var q : Int = 0
//    while (a > 0) {
//        a /= 10;
//        q++
//    }
//    println(q)
//}

//           5
//fun main(){
//    var a = readLine()!!.toInt()
//    var w : Int = 0
//    while (a > 0) {
//        println(a%10)
//        if(a%10 == 0 || a%10 == 5)
//            w++
//        a /= 10
//    }
//    println("Количество 0 и 5 в числе: $w")
//}

//     6
//fun main(){
//    var a = readLine()!!.toInt()
//    var w : Int = 0
//    while (a > 0) {
//        println(a % 10)
//        w += a % 10
//        a /= 10
//        w*=10
//    }
//    println(w/10)
//}

//    7
//import kotlin.math.pow
//fun main(){
//    var a = readLine()!!.toDouble()
//    var w : Double = 0.0
//    var st : Double = 3.0
//    w+=a
//    while(st<=11){
//        w+=a.pow(st)/st
//        st+=2
//    }
//println(w)
//
//}

//    8
//fun main() {
//    var ves = 0
//    println("Введите кол-во предметов: ")
//    var y = readLine()!!.toInt()
//    for (i in 1..y){
//        println("Введите вес предмета: ")
//        var x = readLine()!!.toInt()
//        ves = ves + x
//    }
//    println(ves)
//}

//9
//fun main() {
//    var ameba = 1
//    var interv = 0
//    while(interv < 24){
//        interv = interv + 3
//        ameba = ameba * 2
//        println("$interv, $ameba")
//    }
//}

// 10
//fun main() {
//    println("Введите кол-во элементов: ")
//    var m = readLine()!!.toInt()
//    var array = IntArray(m)
//    for (i in 0..m-1){
//        println("Введите $i элемент: ")
//        array[i] = readLine()!!.toInt()
//    }
//    println("Введите n: ")
//    var n = readLine()!!.toInt()
//    var s = 0.0
//    var k = 0
//    for (i in 0..m-1){
//        if (array[i]%n==0){
//            s = s + array[i]
//            k = k + 1
//        }
//    }
//    s=s/k
//    println(s)
//}

//11
//fun main() {
//    println("Ваедите 10 чисел")
//    var n = 10
//    var array = IntArray(n)
//    var k = 0
//    for (i in 0..9){
//        println("Введите a$i элемент: ")
//        array[i] = readLine()!!.toInt()
//    }
//    for (i in 0..9){
//        if( array[i]>0 ){
//            k++
//        }
//    }
//    if(k > 5){
//        println("Кол-во положительных чисел превышает 5")
//    }
//    else{
//        println("Кол-во положительных чисел не превышает 5")
//    }
//}

//12
//import kotlin.math.sqrt
//fun main() {
//    println("Введите координаты первой вершины")
//    var Ax = readLine()!!.toDouble()
//    var Ay = readLine()!!.toDouble()
//    println("Введите координаты второй вершины")
//    var Bx = readLine()!!.toDouble()
//    var By = readLine()!!.toDouble()
//    println("Введите координаты третей вершины")
//    var Cx = readLine()!!.toDouble()
//    var Cy = readLine()!!.toDouble()
//
//    var a = sqrt((Bx - Ax)*(Bx - Ax)+(By - Ay)*(By - Ay))
//    var b = sqrt((Cx - Bx)*(Cx - Bx)+(Cy - By)*(Cy - By))
//    var c = sqrt((Cx - Ax)*(Cx - Ax)+(Cy - Ay)*(Cy - Ay))
//    var p = (a + b + c)/2
//    var S = sqrt(p*(p-a)*(p-b)*(p-c))
//    println("Площадь треугольника равна $S")
//}

//13
//fun main() {
//    println("Ваедите 5 чисел")
//    var n = 5
//    var array = IntArray(n)
//    var k = 0
//    for (i in 0..4){
//        println("Введите a$i элемент: ")
//        array[i] = readLine()!!.toInt()
//    }
//    for (i in 0..4){
//        if( array[i]>0 ){
//            k++
//        }
//    }
//    println("Кол-во положительных чисел равно: $k")
//}

//14

//fun main() {
//    println("Введите числитель")
//    var a = readLine()!!.toInt()
//    println("Введите знаменатель")
//    var b = readLine()!!.toInt()
//    if (a>=b){
//        println("Дробь неправильная")
//    }
//    else{
//        println("Дробь правильная")
//    }
//
//}

//  15
//fun main() {
//    println("Введите координаты первой точки")
//    var Ax = readLine()!!.toDouble()
//    var Ay = readLine()!!.toDouble()
//    println("Введите координаты второй точки")
//    var Bx = readLine()!!.toDouble()
//    var By = readLine()!!.toDouble()
//    var A1 = Ax + Ay
//    var A2 = Bx + By
//    if (A1 > A2){
//        println("Вторая точка ближе к началу координат")
//    }
//    else{
//        println("Первая точка ближе к началу координат")
//    }
//}

// 16
//fun main() {
//    val Ak = 1024
//    println("Введите первое число кодового замка")
//    var a1 = readLine()!!.toInt()
//    println("Введите второе число кодового замка")
//    var a2 = readLine()!!.toInt()
//    println("Введите третие число кодового замка")
//    var a3 = readLine()!!.toInt()
//    println("Введите четвёртое число кодового замка")
//    var a4 = readLine()!!.toInt()
//    a1 = a1 * 1000
//    a2 = a2*100
//    a3 = a3*10
//    var Ar = a1 + a2 + a3 + a4
//    if (Ar == Ak){
//        println("Кодовый замок получилось открыт")
//    }
//    else{
//        println("Кодовый замок не получилось открыть")
//    }
//
//}

//  17
//fun main(){
//    var min = readLine()!!.toInt()
//    var a : Int = 0
//    if (min <= 500)
//        a = 350
//    else (min > 500)
//        a = ((min - 500) * 2 ) + 350
//    println("Цена за тариф составит: $a рублей.")
//
//}

// 18
//fun main(){
// var month = readLine()!!.toInt()
// if(month in 1..12)
// println("Месяц введен корректно.")
// else println("Ошибка. Проверьте правильность введенных данных.")
//
// var day = readLine()!!.toInt()
// if (month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12 ){
// if (day in 1..31 )
// println("День введен корректно.")
// else println("Ошибка. Проверьте правильность введенных данных.")
// }
//
// if (month == 2 ){
// if (day in 1..29 )
// println("День введен корректно.")
// else println("Ошибка. Проверьте правильность введенных данных.")
// }
//
// if (month == 4 || month == 6 || month ==9 || month ==11 ){
// if (day in 1..30 )
// println("День введен корректно.")
// else println("Ошибка. Проверьте правильность введенных данных.")
// }
//
//}

//  19
//fun main(){
//    var age = readLine()!!.toInt()
//    var x : String = " "
//    if(age <= 6)
//        x = "Дошкольник"
//    else if(age in 7..18)
//        x = "Школьник"
//    else if(age in 19..59)
//        x = "Рабочий"
//    else if(age >= 60)
//        x = "Пенсионер"
//    println(x)
//}

//    20

//fun main() {
//    print("Введите целое число:\n")
//    var K = Integer.valueOf(readLine())
//    var M = Integer.valueOf(readLine())
//    var f = 1
//    if(M < 1) {
//        print("Ошибка")
//        f = 0
//    }
//    if(f == 1){
//        print("Промежуточные числа:\n")
//        if(K < 1) {
//            K = 1
//        }
//        for(i in K..M){
//            print(i.toString() + " ")
//        }
//    }
//}

//  21

//fun main() {
//    print("Введите число Фибоначчи: ")
//    var num = Integer.valueOf(readLine())
//    var t1 = 0
//    var t2 = 1
//    var res = 0
//    for (i in 2..num) {
//        res = t1 + t2
//        t1 = t2
//        t2 = res
//    }
//    print(t1)
//}

// 22

//fun main() {
//    print("Введите целое число: ")
//    var n = Integer.valueOf(readLine())
//    var c = 0
//    print("Делители: ")
//    for(i in 1..n){
//        if(n % i == 0){
//            print("$i ")
//            c += 1
//        }
//    }
//    print("\nВсего делителей: $c")
//}

//  23

//fun main() {
//    print("Введите число: ")
//    var num1 = Integer.valueOf(readLine())
//    var i = 2
//    var flag = 1
//    while(num1 != i){
//        if (num1 == 1)
//            break
//        if(num1%i==0) {
//            flag = 0
//            break
//        }
//        i += 1
//    }
//    if (flag == 1)
//        print("Это простое число")
//    else {
//        print("Это не простое число")
//    }
//}

// 24
//fun main(){
//// println("Выберите тип топлива: 92(1), 95 (2), 98 (3), дизель (4): ")
// var type = readLine()!!.toInt()
// var pricel : Double = 1.0
//
// if (type == 1 || type == 2 || type == 3 || type == 4){
// if (type == 1) pricel = 47.6
// else if (type == 2) pricel = 51.2
// else if (type == 3) pricel = 48.1
// else if (type == 4) pricel = 52.9
// println("Введите количество топлива: ")
// var l = readLine()!!.toInt()
// var price : Double = 1.0
// price = pricel * l
// println("Стоимость заправки составит: $price")
// }
// else println("Такого индекса нет.")
//
//}
