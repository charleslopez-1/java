public class OddEven {
 public static void main(String[] args) {
    
    int oddCount = 0;
    int evenCount = 0;
    int sumEven = 0;
    int sumOdd = 0;


    for (int i = 0; i <= 100; i++){
        if (i % 2 == 0){
            
            sumEven += i;
            evenCount++;
            
        } else {

            sumOdd += i;
            oddCount++;

            }
    }

    System.out.println("=== SUMMARY ===");
    System.out.println("\nEven Numbers:");
    for (int i = 0; i <= 100; i++){
        if (i % 2 == 0){
            System.out.print("#" + i + " ");
        }
    }

    System.out.println("\n\nOdd Numbers: ");
    for (int i = 0; i <= 100; i++){
        if (!(i % 2 ==0)){
            System.out.print("#" + i + " ");
        }
    }


    System.out.println("\n\nEven total count: " + evenCount);
    System.out.println("Sum of all Even numbers: " + sumEven);

    System.out.println("\nOdd total count: " + oddCount);
    System.out.println("Sum of all Odd Numbers: "+ sumOdd);

    if (sumEven > sumOdd){
        System.out.println("\nThe sum of even numbers is greater than odd numbers");
    } else  {
    System.out.println("\nThe sum of odd numbers is greater than even numbers");
            }

    }   
}
