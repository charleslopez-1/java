import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean first = true;
        int primeCount = 0;
        int primeSum = 0;
        int largestPrime = 0;

        System.out.print("Please enter range of prime numbers: ");
        int n = sc.nextInt();
        System.out.println("\nPrime Numbers from 1 to " + n);

        for (int i = 2; i < n; i++){
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
        if (isPrime){
            largestPrime = i;
            primeSum += i;
            primeCount++;
            if (!first){
                System.out.print(", ");
            }
            System.out.print(i);
            first = false;
            }
        }
        
        System.out.println("\nTotal Prime Numbers: " + primeCount);
        System.out.println("Sum of prime numbers: " + primeSum);
        System.out.println("Largest prime number in the range: " + largestPrime);
        sc.close();
    }
}