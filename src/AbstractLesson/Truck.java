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