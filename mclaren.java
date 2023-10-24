// extends keyword used for inheritence
public class mclaren extends car {

    // Constructor
    public mclaren(String brand, int number_of_doors, String color, int year, String engine, int horsepower, int speed) {
        super(brand, number_of_doors, color, year, engine, horsepower, speed);
    }

    // Local method which is just for the mclaren class
    public void drive(int acceleration) {
        System.out.println("Acceleration set to " + acceleration);
 
    }
    
}
