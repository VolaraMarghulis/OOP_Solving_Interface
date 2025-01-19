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