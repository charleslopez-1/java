import java.util.*;
public class FactorialNum {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        long factNum = 1;

        System.out.print("Enter a number to get the factorial: ");
        int intFactorialNum = console.nextInt();

            for (int i = 1; i <= intFactorialNum; i++){
                factNum *= i; 
                System.out.println(i + "! = " + factNum);
            }

            
        console.close();
    }
}
