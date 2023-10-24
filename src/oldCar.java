public class oldCar{
    int speed = 120;
    int tires = 4;
    int doors = 4;
    void drive(){
        System.out.println("Car can drive.");
    }
    void riverse(){
        System.out.println("car can riverse.");
    }
    void breaks(){
        System.out.println("Car can break");
    }
}
class newCar extends oldCar{
    String gps = "There is gps facilities";
    String camera = "There is a camera.";
    void autoDrive(){
        System.out.println("Car can auto drive.");
    }
}
class Test{
    public static void main(String[] args) {
        newCar nc = new newCar();
        System.out.println("The car's speed is: " + nc.speed +"kmph.");
        System.out.println("The car has: " + nc.tires +"tires.");
        System.out.println("The car has: " + nc.doors +"doors.");
        nc.drive();
        nc.riverse();
        nc.breaks();
        nc.autoDrive();
        System.out.println(nc.gps);
        System.out.println(nc.camera);
    }
}