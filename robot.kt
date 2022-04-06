import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.random.Random
class Robotfifi{
    fun time():String{
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm")
        val formatted = current.format(formatter)
        return formatted
    }
}
interface Alert{
    fun alarm()
    fun heatWater()
}
class Applyalert:Alert{
    override fun alarm(){
        println("Wekup bro")
    }
    override fun heatWater(){
        println("water is ready at 25 degree celcious")
    }
}
class RoboFunction(){
    fun makeCoffe(){
        print("How do you like your coffee (Black/With Milk): ")
        val stringInput = readLine()!!
        if(stringInput=="black"){
            println("Your ${stringInput} coffee is ready")
        }
        else{
            println("Enter valid Input!!!")
        }

    }
    fun heatWater(){
        print("How much tempture heat water: ")
        val stringInput = readLine()!!
        println("water is ready at tem ${stringInput}")
    }
    fun packBag(){
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("EE")
        val formatted = current.format(formatter)
        if(formatted=="Sun"){
            println("Today is Holyday")
        }
        else if(formatted=="Mon"){
            println("pack Laptop")
        }
        else if(formatted=="Tue"){
            println("pack physics notebook and english book")
        }
        else if(formatted=="Wed"){
            println("pack math notebook take footboll")
        }
        else if(formatted=="Thu"){
            println("pack Story book and written notebook")
        }
        else if(formatted=="Fri"){
            println("pack chemistry notebook as well as book")
        }
        else if(formatted=="Sat"){
            println("today is playing day so take basketball")
        }
    }
    fun cookBreakfast(){
        var dish = mutableListOf("Bangers and mash","Bedfordshire clanger","Beans on toast",
        "Chicken tikka masala","Cobbler","Cauliflower cheese","Faggots","Fish and chips")
        // val myRandomValues = List(2) { Random.nextInt(0, 30) }
        var x = (0..7).random()
        var y = (0..7).random()
        println("Today in breakfast dish is ${dish[x]} and in lunch dish is ${dish[y]}")

    }
}
fun main() {
    var robot = Robotfifi()
    var alert = Applyalert()
    var function = RoboFunction()
    if(robot.time()=="6:30"){
        function.makeCoffe()
    }
    if(robot.time()=="6:10"){
        alert.alarm()
    }
    if(robot.time()=="7:15"){
        alert.heatWater()
    }
    if(robot.time()=="8:10"){
        function.heatWater()
    }
    if(robot.time()=="9:10"){
        function.packBag()
    }
    if(robot.time()=="8:40"){

    }
    function.cookBreakfast()
    print(robot.time())
}