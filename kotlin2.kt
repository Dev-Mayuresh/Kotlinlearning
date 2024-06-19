
//class with multiple objects
class employee {
    var name: String = ""
    var age : Int = 0
    var gender : Char = 'M'
    var salary : Double = 0.toDouble()

    fun insertValues(n : String, a : Int,  g: Char,s: Double)
    {
        name = n
        age = a
        gender  = g
        salary = s
        println("Name of the employee: $name")
        println("Age of the employee: $age")
        println("Gender : $gender")
        println("Salary of the employee: $salary")
    }

    fun insertName(n : String) {
        this.name = n
    }
}

fun main(args: Array<String>) {
    var obj = employee()

    var obj2 = employee()

    obj.insertValues("Mayuresh", 19, 'M', 50000.00)

    obj2.insertName("Aliena")

    println("Name of the employee: ${obj2.name}")


}