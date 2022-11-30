class WaterBottle {
  val size: String = "500 ml"
  val canBeDrankOutOf: Boolean = true
}

val mercatorChilisBottle: WaterBottle = new WaterBottle()
mercatorChilisBottle.size

class ICECar(val manufacturer: String, val colour: String)
val ford: String = "Ford"
val fiesta: ICECar = new ICECar(ford, "Red")

fiesta.manufacturer

object CountryArea {
  val england: Int = 130373
  val scotland: Int = 78775
  val wales: Int = 20767
  val northernIreland: Int = 14120
}

CountryArea.england
CountryArea.northernIreland

class Automobile{
  val driveTrain: String = "Depends"
  val canMove: Boolean = true
  val whereDoesItMove: String = "Road"
}

object ElectricVehicle extends Automobile {
  override val driveTrain: String = "Electric"
}

ElectricVehicle.whereDoesItMove

trait ModelCar {
  val nickName: String
}

object HydrogenVehicle extends Automobile with ModelCar {
  val nickName: String = "hydrie"
}

HydrogenVehicle.nickName
HydrogenVehicle.canMove

///////////////
// Practical //
///////////////

trait Artillery {
  val numGuns: Int = 50
  val range: Int = 2000
}

trait RenownedDesigner {
  val name: String = "Simon Drugan"
  val location: String = "Bristol"
}

class Boat(val length: Int,
           val width: Int,
           val topSpeed: Int)
{

}

class SailBoat extends Boat(length = 40, width = 80, topSpeed = 15) {
  val numSails: Int = 1
  val hasOars: Boolean = false
  val canTrack: Boolean = false
}

class MotorBoat extends Boat(length = 35, width = 20, topSpeed = 25) {
  val engineSize: Int = 5000
  val fuelType: String = "Diesel"
}

object LuxurySailBoat extends SailBoat with RenownedDesigner {
  val hasJacuzzi: Boolean = true
  val hasBooze: Boolean = true
}

object PirateShip extends SailBoat {
  val numGangPlanks: Int = 10000
}

object WarShip extends MotorBoat with Artillery {
  val country: String = "United Kingdom"
}

object PacerBoat extends MotorBoat {
  val sponsor: String = "Mercator"
  val quarterMileTime: Double = 1.45
}

LuxurySailBoat.hasBooze
LuxurySailBoat.name
LuxurySailBoat.length