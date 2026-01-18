import java.io.*;

class Vehicle {

    String brand;
    String model;
    int year;

    public void displayDetails() {

        System.out.printf("Brand: %s | Model: %s | Year: %d", brand, model, year);
    }
}

class Motorcycle extends Vehicle {

    String engine;
    
    @Override
    public void displayDetails(){

        System.out.println("--- Vehicle Details ---");
        System.out.printf("Brand: %s | Model: %s | Year: %d | Engine: %s", brand, model, year, engine);

    }
}

class Car extends Vehicle{

    int numberOfDoors;

    @Override
    public void displayDetails(){

        System.out.println("--- Vehicle Details ---");
        System.out.printf("Brand: %s | Model: %s | Year: %d | Doors: %d", brand, model, year, numberOfDoors);
    }

}

public class InheritanceVehicle{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car car = new Car();
        Motorcycle motor = new Motorcycle();

    while (true){
        System.out.print("Enter vehicle type: ");
        String strChoice = br.readLine();

            if (strChoice.equalsIgnoreCase("Car")){

                System.out.print("Enter brand: ");
                car.brand = br.readLine();

                System.out.print("Enter model: ");
                car.model = br.readLine();
            
        while (true) {
            try {
                System.out.print("Enter year: ");
                car.year = Integer.parseInt(br.readLine());
                break;
             } catch(NumberFormatException e){
                System.out.println("Invalid! please enter a valid year (e.g 2022).");
                }
            }

        while (true){
            try {
                System.out.print("Enter number of Doors: ");
                car.numberOfDoors = Integer.parseInt(br.readLine());
                break;
                
                } catch(NumberFormatException e){
                    System.out.println("Invalid! Please enter a valid number of doors.");
                }
                
                } 
                
                car.displayDetails();

            } else if (strChoice.equalsIgnoreCase("Motorcycle")){

                System.out.print("Enter brand: ");
                motor.brand = br.readLine();

                System.out.print("Enter model: ");
                motor.model = br.readLine();

                System.out.print("Enter year: ");
                motor.year = Integer.parseInt(br.readLine());

                System.out.print("Enter engine type: ");
                motor.engine = br.readLine();

                motor.displayDetails();
            } else {
                System.out.println("Invalid vehicle type! please enter either Car or Motorcycle");
                continue;
            }
            break;
        } 
    }
}






