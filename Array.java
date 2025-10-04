import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    int odd = 0;
    int even = 0;
    int sum = 0;

    System.out.println("Please enter numbers in the array: ");
    for(int i = 0; i < 5; i++){
        System.out.print("Element #"+ (i + 1) + ": ");
        arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0){
                even++;
            } else {
            odd++;
            }
        sum += arr[i];
        }
    System.err.println("\nOdd numbers: " + odd);
    System.out.println("Even numbers: "+ even);

    System.out.println("\nEven numbers");
    for(int i = 0; i < 5; i++){
        if (arr[i] % 2 == 0){
            
            System.out.print(arr[i] + ", ");
        } 
    }

    System.out.println("\nOdd numbers");
    for(int i = 0; i < 5; i++){
        if (!(arr[i] % 2 == 0)) {    
            System.out.print(arr[i] + ", ");
        }       
    }
        
    System.out.print("\nSum = "+ sum);
    sc.close();
    }
}

