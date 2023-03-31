fun main(){
    println(evenIndices(listOf("Jane","Joy","Jace","Peter","Yvonne","leah","Becca","Cate","Levi","Sean")))
println( calculation(listOf(12,45,23,22,54,56,10,42)))
    ppl()
    println( cars())
}
//1.Given a list of 10 strings, write a function that returns a list of the strings at even indices
// i.e index 2,4,6 etc (2 points)
fun evenIndices(names:List<String>):List<String>{
    var x= mutableListOf<String>()
    for (name in names){
if (names
    .indexOf(name)%2==0){
    x+=" "+name
}
    }
   return x
}
//2. Given a list of people’s heights in metres. Write a function that returns the average height
// and the total height (2 points)
data class heights(var average: Double,var sum:Int)
fun calculation(height:List<Int>):heights{
    var avg=height.average()
    var total=height.sum()
    var both=heights(avg,total)
    return both
}
//3. Given a list of Person objects, each with the attributes, name, age, height and weight.
// Sort the list in order of descending age (2 points)
data class person(val name:String,val age:Int,val height:Int,val weight:Double)
    fun ppl() {
        var per1 = person("Rebecca", 20, 55, 53.40)
        var per2 = person("Grace", 18, 57, 50.45)
        var per3 = person("Jane", 15, 49, 45.60)
        val person = listOf(per1, per2, per3)
        val sortedAge = person.sortedByDescending { z -> z.age }
        println(sortedAge)
    }


//4. Given a list similar to the one above, write a function in which you will create 2 more
// people objects and add them to the list at one go. (1 points)

//5. Write a function that takes in a list of Car objects each with a  registration and mileage
// attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class car(var registration:String,var mileage:Int)
fun cars() :Int{
    var car1 = car("KBX", 1000)
    var car2 = car("KBZ", 1200)
    var cacls = listOf(car1, car2)
    val mileagecacls = cacls.sumOf { y -> y.mileage }/cacls.size
    return mileagecacls
}
