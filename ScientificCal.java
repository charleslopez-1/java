import java.util.Scanner;

public class ScientificCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

    System.out.println("--- SCIENTIFIC CALCULATOR ---");
    System.out.println("1. Addition\n2. Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Factorial\n7.Power");
    System.out.print("\nPlease choose an option: ");
    choice = sc.nextInt();


    switch(choice){

        case 1:
        System.out.println("\nYou chose Addition! Press '=' to exit");
        int addResult = addNumbers(sc);
        System.out.print("Result = " + addResult);

        case 2:
        




    }



    }
    


static int addNumbers(Scanner sc){

    int sum = 0;
    
    while (true){

        for (int i = 0; ; i++){
        System.out.print("Enter number " + (i + 1) + ": ");
        String input = sc.next();
        
        if (input.equals("=")){
            return sum;
                }
            
        int num = Integer.parseInt(input);
        sum += num;
            }
        }
    }

}