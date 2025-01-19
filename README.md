## Task
A company is developing a system for smart vehicles that can manage cars, motorcycles, and trucks. Each vehicle must be able to:

✅ Start and stop the engine

✅ Calculate fuel consumption

Vehicles can be either electric or fuel-powered, and each type of vehicle has specific characteristics.

### To Do:
Create an interface Vehicle that includes methods for:

    startEngine()
    stopEngine()
    calculateConsumption(double distance) (returns the fuel consumption for a given distance).

Create an abstract class VehicleAbstract that implements Vehicle and defines:

    A brand attribute
    A concrete method displayDetails()

Create specific classes for each type of vehicle:

    Car
    Motorcycle
    Truck

Vehicles can be either electric or fuel-powered:

    Electric cars consume energy in kWh.
    Trucks and motorcycles consume fuel in liters.

In the Main class, create objects for each type of vehicle and simulate a journey.

#### Solution :

```java
package AbstractLesson;
//Create interface with 3 methods
public interface Vehicle {
    public void startEngine();
    public void stopEngine();
    public double calculateConsumption(double distance);
}
```
```java
package AbstractLesson;
//Abstract class implements Vehicle
public abstract class VehicleAbstract implements Vehicle {
   //add a variable
    public String mark;
    //constructor
    public VehicleAbstract(String mark){
        this.mark = mark;
    }
    //to display information
    public void displayDetails() {
        System.out.println("Car mark: " + mark);
    }
}
```
```java
package AbstractLesson;
//Class Car provide implementations for all abstract methods in VehicleAbstract
public class Car extends VehicleAbstract {
    //Instance variable
    boolean isElectric;
    double electricConsumtion;
    double dieselConsumption;

    //Constructor initializes a new car object
    public Car(String mark, boolean isElectric, double electricConsumtion, double dieselConsumption) {
        super(mark);
        this.isElectric = isElectric;
        this.electricConsumtion = electricConsumtion;
        this.dieselConsumption = dieselConsumption;
    }

    //Overriding methods from VehicleAbstract
    @Override
    public void startEngine() {
        System.out.println("Car " + mark + " is start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car " + mark + " is stop");
    }

    @Override
    public double calculateConsumption(double distance) {
        if (isElectric) {
            return (distance / 100) * electricConsumtion;
        } else {
            return (distance / 100) * dieselConsumption;
        }
    }
}
```
```java
package AbstractLesson;

public class Motorcycle extends VehicleAbstract {
    double dieselConsumption;
   public Motorcycle( String mark, double dieselConsumption){
       super(mark);
       this.dieselConsumption = dieselConsumption;
   }
    @Override
    public void startEngine() {
        System.out.println("Motorcycle " + mark + " is start");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle " + mark + " is stop");
    }
    @Override
    public double calculateConsumption(double distance) {
        return (distance/100) * dieselConsumption;
    }
}
```
```java
package AbstractLesson;

public class Truck extends VehicleAbstract{
    double dieselConsumption;
    public Truck(String mark, double dieselConsumption){
        super(mark);
        this.dieselConsumption = dieselConsumption;
    }
    @Override
    public void startEngine() {
        System.out.println("Truck " + mark + " is start");
    }
    @Override
    public void stopEngine() {
        System.out.println("Truck " + mark + " is stop");
    }
    @Override
    public double calculateConsumption(double distance) {
        return (distance / 100) * dieselConsumption;
    }
}
```
```java
import AbstractLesson.*;
 public class Main {
    public static void main(String[] args) {
        VehicleAbstract electricCar = new Car("Toyota",true,7.3, 0);
        VehicleAbstract clasicCar = new Car("BMW", false,0,9);
        VehicleAbstract motorcycle = new Motorcycle("Honda",12.3);
        VehicleAbstract truck = new Truck("Volvo", 15);

        double distance = 200; //simulating the journey

        electricCar.startEngine();
        clasicCar.startEngine();
        motorcycle.startEngine();
        truck.startEngine();

        electricCar.displayDetails();
        System.out.println("Consumption for " + distance + " km " + electricCar.calculateConsumption(distance) + " kWh\n");
        clasicCar.displayDetails();
        System.out.println("Consumption for " + distance + " km " + clasicCar.calculateConsumption(distance) + " l\n");
        motorcycle.displayDetails();
        System.out.println("Consumption for " + distance + " km " + motorcycle.calculateConsumption(distance) + " l\n");
        truck.displayDetails();
        System.out.println("Consumption for " + distance + " km " + truck.calculateConsumption(distance) + " l\n");

        electricCar.stopEngine();
        clasicCar.stopEngine();
        motorcycle.stopEngine();
        truck.stopEngine();
    }
}
```
