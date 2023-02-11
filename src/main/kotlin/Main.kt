import kotlin.concurrent.thread

fun main() {
name("Williams")
  modulous(78,13)
     addition(23.5, 56.8, 65.2, 12.4)
     facts()
}
  fun name(fullname: String){
      var greeting = "Goodmorning" + " " + fullname
      println(greeting)
}
fun modulous(num1: Int, num2: Int) :Int{
    var division = num1 % num2
    return division
}

    fun addition(num1: Double, num2: Double, num3: Double, num4: Double) :Double{
        var add = num1 + num2 + num3 + num4
        return add

    }
fun facts(){
    var facts = "Am grateful"
    println(facts)
}

