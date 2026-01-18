import java.io.*;

abstract class Employee{

    abstract float calculateSalary();
    abstract void displayInfo();
    void companyPolicy(){
        System.out.println("Company Policy: All employees must submit attendance before payroll processing.");
    }
} 

class FullTimeEmployee extends Employee {

    int daysWorked;
    float dailyRate;
    String name;

    FullTimeEmployee(String name, int daysWorked, float dailyRate){
        this.name = name;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }
    @Override
    float calculateSalary() {

        return daysWorked * dailyRate;
    }
    @Override
    void displayInfo(){
        System.out.println("Salary: PHP" + calculateSalary());
        companyPolicy();;
    }
    }
    
class PartTimeEmployee extends Employee {
    int hoursWorked;
    float hourlyRate;
    String name;

    PartTimeEmployee(String name, float hourlyRate, int hoursWorked){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    float calculateSalary(){
        return hoursWorked * hourlyRate;
    }
    @Override
    void displayInfo() {
        System.out.println("Salary: PHP:" + calculateSalary());
        companyPolicy();
    }
}

public class AbstractionEmployee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
        System.out.print("Enter employee type: ");
        String strType = br.readLine();

        if (strType.equalsIgnoreCase("Full-Time")){
            
            System.out.print("Enter name: ");
            String strFullTimeName = br.readLine();

            System.out.print("Enter daily rate: ");
            float floatFullTimeDailyRate = Float.parseFloat(br.readLine());

            System.out.print("Enter days worked: ");
            int intFullTimeDaysWorked = Integer.parseInt(br.readLine());

            FullTimeEmployee full = new FullTimeEmployee(strFullTimeName, intFullTimeDaysWorked, floatFullTimeDailyRate);
            full.calculateSalary();
            full.displayInfo();

        } else if (strType.equalsIgnoreCase("Part-Time")){

            System.out.print("Enter name: ");
            String strPartTimeName = br.readLine();

            System.out.print("Enter hourly rate: ");
            float floatPartTimeHourlyRate = Float.parseFloat(br.readLine());

            System.out.print("Enter hours worked: ");
            int intPartTimeHoursWorked = Integer.parseInt(br.readLine());

            PartTimeEmployee part = new PartTimeEmployee(strPartTimeName, floatPartTimeHourlyRate, intPartTimeHoursWorked);
            part.calculateSalary();
            part.displayInfo();
        } else {
            System.out.println("Invalid type! Please enter either Part-Time or Full-Time");
            continue;
        }
        break;
        }
    }
}
