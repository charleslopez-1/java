import java.io.*;
import java.util.Arrays;

class StringManipulationToolkit {

    // prints the menu for string tool kit
    void printMenu(){

        System.out.println("=== String Toolkit Functions ===");

        System.out.println();
        System.out.println("1. String Reversal");
        System.out.println("2. Palindrome Checker");
        System.out.println("3. Anagram Checker");
        System.out.println("4. Word Counter");
        System.out.println("5. Character Counter");
        System.out.println("6. Substring Finder");
        System.out.println("7. Lower Case Converter");
        System.out.println("8. Upper Case Converter");
        System.out.println("9. Vowel Remover");
        System.out.println("10. Consonant Remover");

        System.out.println();
}
    
    // 3 sentences checker
    public String inputSentenceChecker(BufferedReader br) throws IOException {
    String strInput;

    while (true) {
        strInput = br.readLine();

        if (strInput != null) {
            strInput = strInput.trim();

            // whole input must end in . ! or ?
            if (!strInput.matches(".*[.!?]$")) {
                System.out.println("Input must contain at least 3 sentences.");
                System.out.print("Enter string: ");
                continue;
            }

            String[] sentences = strInput.split("(?<=[.!?])");
            int intCount = 0;
            boolean invalid = false;

            for (String str : sentences) {
                str = str.trim();

                if (str.isEmpty()) continue;

                if (!str.endsWith(".") && !str.endsWith("!") && !str.endsWith("?")) {
                    invalid = true;
                    break;
                }

                intCount++;
            }

            if (!invalid && intCount >= 3) return strInput;
        }

        System.out.println("Input must contain at least 3 sentences.");
        System.out.print("Enter string: ");
    }
}

    // String Reversal method
    public String reverseString(String strInput){

        if (strInput == null){ // null checker
            return "";
        }

        String reversed = new StringBuilder(strInput).reverse().toString(); // reverse the input
            
        return reversed;
    }

    // Palindrome Checker method
    public boolean checkPalindrome(String strInput){

        if (strInput == null) {
            return false;
        }

        strInput = strInput.replaceAll("[^a-zA-Z0-9]", ""); // remove all non alphanum

        String reversed = new StringBuilder(strInput).reverse().toString(); // reverse the string

            return strInput.equalsIgnoreCase(reversed); // if equal = palindrome, else not
        
    }

    // Anagram Checker method
    public boolean checkAnagram(String strInput1, String strInput2){

        if (strInput1 == null || strInput2 == null) {
            return false;
}
        String str1 = strInput1.replaceAll("[^a-zA-Z]", "");
        String str2 = strInput2.replaceAll("[^a-zA-Z]", ""); // remove all non alpha

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray(); // convert strings to array

        Arrays.sort(arr1);
        Arrays.sort(arr2); // converted string to array is sorted

        return Arrays.equals(arr1, arr2); // if true = anagram, else not
           
    }

    // Word Counter method
    public int countWords(String strInput){

        if (strInput == null || strInput.isEmpty()) // returns 0 if null or empty
            return 0;

        // removes non-alphanumeric and spaces at start/end
        strInput = strInput.replaceAll("[^a-zA-Z0-9\\s]", "").trim(); 

        String[] words = strInput.split("\\s+"); // stores the words in the array, white spaces excluded

        return words.length; // counts how many words present in the array
    }

    // Character Count method
    public int countCharacters(String strInput){

        if (strInput == null || strInput.isEmpty()){ // null and empty checker
            return 0; 
        }

        // remove all non-alphanum and white spaces at front/back
        strInput = strInput.replaceAll("\\s+", "").trim();

        return strInput.length(); // returns the number of characters
    }

    // Substring Finder method
    public int findSubstringOccurrences(String strInput, String strSubFinder){
        if (strInput == null || strSubFinder == null || strSubFinder.isEmpty()) 
            return 0; // null/empty checker

        int index = 0;
        int count = 0;
        int subStrLen = strSubFinder.length(); // get the length of the substring

        while (true){

            index = strInput.indexOf(strSubFinder, index);

                if (index == -1) break; // stop if there are no more matches

                    count++; // increment for each match found

                    index = index + subStrLen; // index moves forward to check for another
        }

        return count; // return total matches found
    }

    // Lower Case Converter method
    public String convertToLowerCase(String strInput){
        return strInput.toLowerCase();
    }

    // Upper Case Converter method
    public String convertToUpperCase(String strInput){
        return strInput.toUpperCase();
    }

    // Vowel Remover method
    public String removeVowels(String strInput){
        return strInput.replaceAll("[aeiouAEIOU]", "");
    }

    // Consonant Remover method
    public String removeConsonants(String strInput){
        return strInput.replaceAll("(?i)[b-df-hj-np-tv-z]", "");
    }
}

public class LOPEZ_MP3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringManipulationToolkit strToolKit = new StringManipulationToolkit();

        strToolKit.printMenu();

        while (true){
            System.out.print("Input choice: ");
            String strChoice = br.readLine();

                switch (strChoice) {

                    case "1":
                        System.out.println("\n1. String Reversal");
                        System.out.print("Enter string: ");
                        String inputReverse = strToolKit.inputSentenceChecker(br);

                        System.out.println("Reversed String: " + strToolKit.reverseString(inputReverse));

                        break;


                    case "2":
                        System.out.println("\n2. Palindrome Checker");
                        System.out.print("Enter string: ");
                        String inputPalindrome = strToolKit.inputSentenceChecker(br);

                        boolean isPalindrome = strToolKit.checkPalindrome(inputPalindrome);

                        if (isPalindrome){

                            System.out.println(inputPalindrome + " is a Palindrome!");

                        } else {

                            System.out.println(inputPalindrome + " is not a Palindrome!");
                        }
                         
                        break;

                    case "3":
                        System.out.println("\n3. Anagram Checker");
                        System.out.print("Enter first string: ");
                        String inputAnagram1 = strToolKit.inputSentenceChecker(br);

                        System.out.print("Enter second string: ");
                        String inputAnagram2 = strToolKit.inputSentenceChecker(br);

                        boolean areAnagram = strToolKit.checkAnagram(inputAnagram1, inputAnagram2);

                        if (areAnagram){
                            System.out.println("\"" + inputAnagram1 + "\" and \"" + inputAnagram2 + "\" are an Anagram");
                        
                        } else {

                            System.out.println("\"" + inputAnagram1 + "\" and \"" + inputAnagram2 + "\" are not an Anagram");
                        }

                        break;


                    case "4":
                        System.out.println("\n4. Word Counter");
                        System.out.print("Enter string: ");
                        String inputWords = strToolKit.inputSentenceChecker(br);

                        System.out.println("Number of words: " + strToolKit.countWords(inputWords));

                        break;


                    case "5":
                        System.out.println("\n5. Character Count");
                        System.out.print("Enter string: ");
                        String inputChars = strToolKit.inputSentenceChecker(br);

                        System.out.println("Number of characters: " + strToolKit.countCharacters(inputChars));

                        break;


                    case "6":
                        System.out.println("\n6. Substring Finder");
                        System.out.print("Enter string: ");
                        String inputStringSub = br.readLine();

                        System.out.print("Enter substring to find: ");
                        String inputSubFinder = br.readLine();

                        int occurrences = strToolKit.findSubstringOccurrences(inputStringSub, inputSubFinder);

                        System.out.println("Occurrences of \"" + inputSubFinder + "\": " + occurrences);
                        break;


                    case "7":
                        System.out.println("\n7. Lower Case Converter");
                        System.out.print("Enter string: ");
                        String inputLower = strToolKit.inputSentenceChecker(br);

                        System.out.println("Lower Case: " + strToolKit.convertToLowerCase(inputLower));
                        break;


                    case "8":
                        System.out.println("\n8. Upper Case Converter");
                        System.out.print("Enter string: ");
                        String inputUpper = strToolKit.inputSentenceChecker(br);

                        System.out.println("Upper Case: " + strToolKit.convertToUpperCase(inputUpper));
                        break;


                    case "9":
                        System.out.println("\n9. Vowel Remover");
                        System.out.print("Enter string: ");
                        String inputVowel = strToolKit.inputSentenceChecker(br);

                        System.out.println("Non-vowel string: " + strToolKit.removeVowels(inputVowel));
                        break;


                    case "10":
                        System.out.println("\n10. Consonant Remover");
                        System.out.print("Enter string: ");
                        String inputConsonant = strToolKit.inputSentenceChecker(br);

                        System.out.println("Non-consonant string: " + strToolKit.removeConsonants(inputConsonant));
                        break;


                    default:
                        System.out.println("Invalid! Only input numbers 1-10 are accepted!");

                continue;

                } break;
            }
        }
    }
