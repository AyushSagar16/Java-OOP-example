public class car {

    // Attributes
    String brand_;
    int number_of_doors_;
    String color_;
    int year_;
    String engine_;
    int horsepower_;

    // Encapsulation
    private int speed_;

    // Final keyword
    private final double pi = 3.14;

    
    // Constructor
    public car(String brand, int number_of_doors, String color, int year, String engine, int horsepower, int speed) {
   
        brand_ = brand;
        number_of_doors_ = number_of_doors;
        color_ = color;
        year_ = year;
        engine_ = engine;
        horsepower_ = horsepower;

        speed_ = speed;
    }

    // Methods (Functions)
    public void drive(int acceleration, int maxSpeed) {
        System.out.println("Acceleration set to " + acceleration);
        System.out.println("Max speed is " + maxSpeed);
    }

    // Encapsulation Getter and setter methods
    public int getSpeed() {
        return speed_;
    }

    public void setSpeed(int newSpeed) {
        speed_ = newSpeed;
    }



    // Constants class
    public static class Constants {
        private static final double kGearRatio = 0.14;
        private static final double pi = 3.14;
    }

}
