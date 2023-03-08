fun main() {
    var car = Car("Toyota","Prado","Blue",38 )
    car.carry(40)
    car.carry(38)
    car.identity()
    println(car.calculateParkingFees(15))
    var bus = Bus("Toyota","Prado","Blue",30 )
    bus.carry(36)
    bus.carry(30)
    bus.identity()
    println(bus.calculateParkingFees(25))




}
open class Vehicle(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people: Int) {
        var x = people -capacity
        if (people <= capacity)
            println("carrying  $people passengers")
        else{
            println("over-capacity by $x people")
        }

    }

    fun identity(){
        println("I am a Blue Toyota Prado")
    }
    fun calculateParkingFees(hours: Int):Int{
        val calculation = hours*20
        return calculation
    }

}


 class Car( make:String, model:String, colour:String,capacity:Int):Vehicle(make, model, colour, capacity){

 }
class Bus( make:String,model:String, colour:String,capacity:Int):Vehicle(make, model, colour, capacity){
    fun maxTripFare(fare: Double): Double{
        return fare.times(capacity)
    }
}
