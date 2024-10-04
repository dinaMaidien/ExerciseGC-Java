 
 //superclass
 class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;
    
    // Constructor=================================================================================
    public Vehicle(String make, String model, int year, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
        }
    
    // Getters=======================================================================================
    public String getMake() {
        return make;
        }
    
    public String getModel() {
        return model;
        }
    
    public int getYear() {
        return year;
        }
    
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
        }
    
    // Method to calculate rental cost=================================================================
        public double calculateRentalCost(int days) {
            double rental= rentalPricePerDay * days;
            return rental;
        }
 }
   //subclasses=================================================================================================
    class Car extends Vehicle{
     private int numSeats;
     private int numDoors;
    
    // Constructor
    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors) {
      super(make, model, year, rentalPricePerDay);
      this.numSeats = numSeats;
      this.numDoors = numDoors;
    }
    
    // Getters
      public int getNumSeats() {
        return numSeats;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
    }

    //subclasses======================================================================================================
    class Motorcycle extends Vehicle{
        private int engineSize;

        //constructor =====================================================================================
        public Motorcycle(String make, String model, int year, double rentalPricePerDay,int engineSize){
            super(make, model, year, rentalPricePerDay);
            this.engineSize = engineSize;
        }


      //getter===================================================================================
        public int getEngineSize() {
            return engineSize;
        }

    }

     public class VehicleRental{
      public static void main (String[]args){
        //create car object ================================================
         int days= 3;
         
         Car cars= new Car("Viva", "Perodua", 1990, 200, 6, 7);

         //create motor object===============================================
         Motorcycle motorcycle= new Motorcycle( "dina", "Y15", 1550, 100, 500);
          
    
      // output Car details
      System.out.println("Car Details:");
      System.out.println("Make: " + cars.getMake());
      System.out.println("Model: " + cars.getModel());
      System.out.println("Year: " + cars.getYear());
      System.out.println("Seats: " + cars.getNumSeats());
      System.out.println("Doors: " + cars.getNumDoors());
      System.out.println("Rental cost:" + cars.calculateRentalCost(days)); // method ni sbb kat method ada parameter so kena masukkan days, and days kena initiate dalam main

      // Output Motorcycle details
      System.out.println("\nMotorcycle Details:");
      System.out.println("Make: " + motorcycle.getMake());
      System.out.println("Model: " + motorcycle.getModel());
      System.out.println("Year: " + motorcycle.getYear());
      System.out.println("Engine Size: " + motorcycle.getEngineSize() + "cc");
      System.out.println("Rental cost: " + motorcycle.calculateRentalCost(days));
  }

    }
    
    




    
    