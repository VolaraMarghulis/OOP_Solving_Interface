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