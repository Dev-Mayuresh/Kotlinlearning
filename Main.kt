
//conditional operators
fun main() {
    var obj1 = Person("Mayuresh",19)
    obj1.canVote()
}
class Person(var name : String ,var age : Int) {
     fun canVote()
    {
         if(age<18){
             println("$name cannot vote")
         }
        else{
            println("$name can vote")
         }
    }
}