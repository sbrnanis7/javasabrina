class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;


    public Vehicle(String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;

}
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double rentalPricePerDay(){
        return rentalPricePerDay;
    }

    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

}
class Car extends Vehicle {
    private int numSeats;
    private int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors) {
        super(make, model, year, rentalPricePerDay);  
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize) {
        super(make, model, year, rentalPricePerDay);  
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }
}

public class SewaKereta {
    public static void main(String[] args) { //instance
        Car car = new Car("Honda", "City", 2020, 50.0, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "LC", 2019, 30.0, 689);

        int rentalDays = 3; //rental cost
        double carRentalCost = car.calculateRentalCost(rentalDays);
        double motorcycleRentalCost = motorcycle.calculateRentalCost(rentalDays);

        System.out.println("\n***********************************");
        System.out.println("Car Details: ");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Seats: " + car.getNumSeats());
        System.out.println("Doors: " + car.getNumDoors());
        System.out.println("Rental Price for " + rentalDays + " days: RM" + carRentalCost);


        System.out.println("\n***********************************");
        System.out.println("\nMotorcycle Details:");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Engine Size: " + motorcycle.getEngineSize() + "cc");
        System.out.println("Rental Price for " + rentalDays + " days: RM" + motorcycleRentalCost);
    }
}
