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