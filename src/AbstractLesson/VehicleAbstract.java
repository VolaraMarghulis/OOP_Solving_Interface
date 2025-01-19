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
