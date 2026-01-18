import java.io.*;
import java.util.Arrays;

abstract class StringManipulationToolkit {

    abstract String executeMethod();

}

class StringReversal extends StringManipulationToolkit{

    private String strInput;

    StringReversal(String strInput){
        this.strInput = strInput;
    }

    @Override
    public String executeMethod(){

        String reversed = new StringBuilder(strInput).reverse().toString();

        return "Reversed String: " + reversed;

    }

}

class PalindromeChecker extends StringManipulationToolkit {

    private String strInput;


    PalindromeChecker(String strInput){
        this.strInput = strInput;

        }

        @Override
        public String executeMethod(){

        strInput = strInput.replaceAll("[^a-zA-Z0-9]", "");

            if (strInput.equalsIgnoreCase(new StringBuilder(strInput).reverse().toString())){

                return strInput + " is a Palindrome";

            } else {

                return strInput + " is not a Palindrome";
            }
    }
}

class AnagramChecker extends StringManipulationToolkit {

    private String strInput1;
    private String strInput2;

    AnagramChecker(String strInput1, String strInput2){
        this.strInput1 = strInput1;
        this.strInput2 = strInput2;

    }

    public String executeMethod(){
        
        strInput1 = strInput1.replaceAll("[^a-zA-Z]", "");
        strInput2 = strInput2.replaceAll("[^a-zA-Z]", "");

        char[] arr1 = strInput1.toLowerCase().toCharArray();
        char[] arr2 = strInput2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){

            return  strInput1 + " and " + strInput2 + " are an Anagram!";
        
        } else {

            return strInput1 + " and " + strInput2 + " are not an Anagram";
        }

    }
}

class WordCounter extends StringManipulationToolkit {

    private String strInput;

    WordCounter(String strInput){
        this.strInput = strInput;
    }

    public String executeMethod(){

        int intCount;

            if (strInput.isEmpty()){

                return "0";
            } 

            String [] words = strInput.split("\s+");
            intCount = words.length;

            return "Number of words: " + String.valueOf(intCount);

    }

}

class CharacterCount extends StringManipulationToolkit {

    private String strInput;

    CharacterCount(String strInput){
        this.strInput = strInput;
    }

    public String executeMethod(){

        strInput = strInput.trim();
        strInput = strInput.replaceAll("\\s+", "");

        int intCharCount = strInput.length();

        return "Number of characters: " + String.valueOf(intCharCount);

    }
}

class SubstringFinder extends StringManipulationToolkit {

    private String strInput;
    private String strSubFinder;

    SubstringFinder(String strInput, String strSubFinder){
        this.strInput = strInput;
        this.strSubFinder = strSubFinder;
    }

    public String executeMethod(){

        int intFromIndex = 0;
        int intCounter = 0;
        int intFound = 0;

        while (true){

            intFound = strInput.indexOf(this.strSubFinder, intFromIndex);
                if (intFound == -1){
            break;
            
        }

            intCounter++;
            intFromIndex = intFound + 1;

        }
            return "Occurrences of \"" + strSubFinder + "\": " + String.valueOf(intCounter);
    }

}

class LowerCaseConverter extends StringManipulationToolkit {

    private String strInput;

    LowerCaseConverter(String strInput){
        this.strInput = strInput;
    }

    public String executeMethod(){

        return "Lower Case: " + strInput.toLowerCase();
    }

}

class UpperCaseConverter extends StringManipulationToolkit {

    private String strInput;

    UpperCaseConverter(String strInput){
        this.strInput = strInput;
    }

        public String executeMethod(){

            return "Upper Case: " + strInput.toUpperCase();

        }
    
}

class VowelRemover extends StringManipulationToolkit {

    private String strInput;

    VowelRemover(String strInput){
        this.strInput = strInput;
    }

    public String executeMethod(){

        String vowel = "[aeiouAEIOU]";

        return "Non-vowel string: " + strInput.replaceAll(vowel, "");

    }
}

class ConsonantRemover extends StringManipulationToolkit {

    private String strInput;

    ConsonantRemover(String strInput){
        this.strInput = strInput;
    }

    public String executeMethod(){

        return "Non-consonant string: " + strInput.replaceAll("(?i)[b-df-hj-np-tv-z]", "");


    }
}

public class String_Manipulation_Toolkit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("String Toolkit Functions");
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

        while (true) {

        System.out.print("Enter number for the method you want to execute: ");
        String strChoice = br.readLine();
        
        switch (strChoice) {
            
            case "1":
                
                System.out.println("\n1. String Reversal");
                System.out.print("Enter string: ");
                String strReversedString = br.readLine();

                StringReversal reverse = new StringReversal(strReversedString);
                System.out.println(reverse.executeMethod());

                break;
            
            case "2":

                System.out.println("\n2. Palindrome Checker");
                System.out.print("Enter string: ");
                String strIfPalindrome = br.readLine();

                StringManipulationToolkit pal = new PalindromeChecker(strIfPalindrome);
                System.out.println(pal.executeMethod());

                break;

            case "3":

                System.out.println("\n3. Anagram Checker");
                System.out.print("Enter first string: ");
                String strIfAnagram1 = br.readLine();

                System.out.print("Enter second string: ");
                String strIfAnagram2 = br.readLine();

                System.out.println();

                StringManipulationToolkit anag = new AnagramChecker(strIfAnagram1, strIfAnagram2);
                System.out.println(anag.executeMethod());

                break;

            case "4":

                System.out.println("\n4. Word Counter");
                System.out.print("Enter string: ");
                String strInputString = br.readLine();

                StringManipulationToolkit count = new WordCounter(strInputString);
                System.out.println(count.executeMethod());
        
                break;

            case "5":

                System.out.println("\n5. Character Count");
                System.out.print("Enter string: ");
                String strCharCount = br.readLine();

                StringManipulationToolkit counter = new CharacterCount(strCharCount);
                System.out.println(counter.executeMethod());

                break;

            case "6":

                System.out.println("\n6. Substring Finder");
                System.out.print("Enter string: ");
                String strInputFullString = br.readLine();

                System.out.print("Enter substring to find: ");
                String strSubFinder = br.readLine();


                StringManipulationToolkit sub = new SubstringFinder(strInputFullString, strSubFinder);
                System.out.println(sub.executeMethod());

                break;
                
            case "7":

                System.out.println("\n7. Lower Case Converter");
                System.out.print("Enter string: ");
                String strToLower = br.readLine();

                StringManipulationToolkit lowercase = new LowerCaseConverter(strToLower);
                System.out.println(lowercase.executeMethod());

                break;
            
            case "8":

                System.out.println("\n8. Upper Case Converter");
                System.out.print("Enter string: ");
                String strToUpper = br.readLine();

                StringManipulationToolkit upper = new UpperCaseConverter(strToUpper);
                System.out.println(upper.executeMethod());

                break;

            case "9":

                System.out.println("\n9. Vowel Remover");
                System.out.print("Enter string: ");
                String strVowelRemover = br.readLine();

                StringManipulationToolkit vowel = new VowelRemover(strVowelRemover);
                System.out.println(vowel.executeMethod());

                break;
                
            case "10":

                System.out.println("\n10. Consonant Remover");
                System.out.print("Enter string: ");
                String strConsonantRemover = br.readLine();

                StringManipulationToolkit consonant = new ConsonantRemover(strConsonantRemover);
                System.out.println(consonant.executeMethod());

                break;

            default:
                System.out.println("Invalid! Only input numbers 1-10 are accepted!");

                continue;
            }
            break;
        } 
    }
}


