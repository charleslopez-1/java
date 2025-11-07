import java.io.*;

public class AutomorphicNum {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intSquare = 0;

        System.out.println("=== Automorphic Number Checker ===");
        while (true) {
        System.out.print("Enter a number: ");
        int Num = Integer.parseInt(br.readLine());

        intSquare = Num * Num;
        
        String squareConvert = String.valueOf(intSquare);
        String numConvert = String.valueOf(Num);

        if (squareConvert.endsWith(numConvert)){
            System.out.println("Number is Automorphic");
        } else {
            System.out.println("Number is not Automorphic");
        }
        
        while (true){
        String choice;
        System.out.print("Do you want to try another number? (y/n): ");
        choice = br.readLine();
        if (choice.equalsIgnoreCase("y")){
            break;
        } else if (choice.equalsIgnoreCase("n")){
            System.out.println("Program Terminated");
            return;
        } else {
            System.out.println("Invalid input, only 'y' or 'n' are accepted");
            }
        }
    }
        
    }
}
