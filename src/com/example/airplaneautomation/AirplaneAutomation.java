package com.example.airplaneautomation;

// Base class Airplane
class Airplane
{
    // Attributes
    String modelName;
    int maxAltitude;

    // Constructor
    Airplane(String modelName, int maxAltitude)
    {
        this.modelName = modelName;
        this.maxAltitude = maxAltitude;
    }

    // Method 1
    void basicInfo()
    {
        System.out.println("The " + modelName + " makes a maximum altitude " + maxAltitude);
    }
    // Method 2
    void performLanding()
    {
        System.out.println("Airplane: performing standard landing sequence.");
    }
}
 // Class PassengerAirplane
class PassengerAirplane extends Airplane{
    int passengerCapacity;
    PassengerAirplane(String modelName, int maxAltitude, int passengerCapacity)
    {
        super(modelName, maxAltitude);
        this.passengerCapacity = passengerCapacity;
    }

    void managePassengers()
    {
        System.out.println("Passenger airplane: managing a capacity of: " + passengerCapacity );
    }

    @Override
    void performLanding()
    {
        System.out.println("Passenger airplane: performing standard landing sequence.");
    }
 }

 class CargoPlane extends PassengerAirplane
 {
     double cargoCapacity;
     CargoPlane(String modelName, int maxAltitude, int passengerCapacity, double cargoCapacity)
     {
         super(modelName, maxAltitude, passengerCapacity);
         this.cargoCapacity = cargoCapacity;

     }

     void manageCargo()
     {
         System.out.println("Cargo plane of " + modelName + " handles cargo capacity of " + cargoCapacity + " and crew capacity of " +passengerCapacity);
     }

     @Override
     void performLanding() {
         System.out.println("Cargo airplane: performing standard landing sequence.");
     }
 }

class FighterJet extends Airplane{
     int weaponCount;
     FighterJet(String modelName, int maxAltitude, int weaponCount )
     {
         super(modelName, maxAltitude);
         this.weaponCount = weaponCount;
     }

     void engageWeapons()
     {
         System.out.println("Ready to engage weapon count: " + weaponCount);
     }

     @Override
    void performLanding()
     {
         System.out.println("Fighter jet: performing standard landing sequence.");
     }
}
public class AirplaneAutomation {

    public static void main(String[] args)
    {
        PassengerAirplane passengerAirplane = new PassengerAirplane("Boeing A21", 2000, 150);
        CargoPlane cargoPlane = new CargoPlane("Boeing A21", 2000, 150,5000);
        FighterJet fighterJet = new FighterJet("MIG", 4000, 35);
        passengerAirplane.performLanding();
        cargoPlane.performLanding();
        fighterJet.performLanding();
    // Rest of the inherited and sub-class methods
        passengerAirplane.basicInfo();
        cargoPlane.manageCargo();
        fighterJet.engageWeapons();
    }
}
