import java.io.*;
import java.util.Arrays;

public class AnagramChecker {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Anagram Checker ===");

        System.out.print("Enter first word: ");
        String strOne = reader.readLine();

        System.out.print("Enter second word: ");
        String strTwo = reader.readLine();

        
        char[] arr1 = strOne.toLowerCase().toCharArray();
        char [] arr2 = strTwo.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println(strOne + " and " + strTwo + " IS an ANAGRAM!");
        } else {
            System.out.println(strOne + " and " + strTwo + " is NOT an ANAGRAM!");
        }

        reader.close();        
    }
}
