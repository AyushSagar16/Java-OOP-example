class app {

    // Creating a car object named 'lamborghini'
    public static final car lamborghini = new car("Lamborghini", 2, "Red", 2040, "V8", 100000, 200);

    // Creating a McLaren Object called 'senna'
    public static final mclaren senna = new mclaren("McLaren", 2, "Orange", 2018, "V8", 1110, 100);

    // Main Method
    public static void main(String args[]) {
        lamborghini.drive(20, 200);
        System.out.println(lamborghini.getSpeed());
        lamborghini.setSpeed(30);
        System.out.println(lamborghini.getSpeed());

        senna.drive(200, 200);

    }

}