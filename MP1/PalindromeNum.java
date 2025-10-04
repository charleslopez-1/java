import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {
        
        try(Scanner scn = new Scanner(System.in)) {

        System.out.println("--- NUMBER PALINDROME CHECKER ---");
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        int orginalNum = num;
        int reversed = 0;

        for(; num != 0; num = num / 10){
            int modulo = num % 10;
            reversed = reversed * 10 + modulo;
        }
            if (orginalNum == reversed){
                System.out.print(orginalNum + " is a Palindrome!");
            } else {
                System.out.println(orginalNum + " is not a palindrome!");
            }
        }
            System.out.print("\nPalindrome Numbers from 1-500:\n");
            for (int i = 1; i <= 500; i++){
                if (checkPalindrome(i)){
                    System.out.print(i + ", ");
                }
            }
    }

    public static boolean checkPalindrome(int n){

            int original = n;
            int reversed = 0;

        while (n != 0){
            int modulo = n % 10;
            reversed = reversed * 10 + modulo;
            n = n/10;
        }
        if (original == reversed){
            return true;
        }

        return false;
    }
}