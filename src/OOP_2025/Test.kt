package OOP_2025



fun main() {
    println("hello kotlin")
    val car : Car = Car("hoa",200)
    val res = if(car.check()) "Yes" else "No"
    println(res)
}