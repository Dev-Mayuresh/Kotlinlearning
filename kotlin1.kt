
//classes and objects
class Car {
    var make : String = ""
    var model : String = ""
    var year : Int = 0
    fun getInfo(): String {
        return "$make $model, year $year"
    }
}

fun main(){
    val myCar = Car()
    myCar.make = "Toyota"
    myCar.model = "Camry"
    myCar.year =  2020
    println(myCar.getInfo())

}