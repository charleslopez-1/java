import java.io.*;
public class ReverseString {
    public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true)
        {
    System.out.println("\n=== Reversed Word Converter ===");
    
    System.out.print("Enter a word to reverse: ");
    String strWord = br.readLine();
    String reversed = "";

    for (int i = strWord.length() - 1; i >= 0; i--){
            reversed += strWord.charAt(i);
            }
            System.out.println("Original: " + strWord);
            System.out.println("Reversed: " + reversed);

            if (strWord.equals(reversed)){
            System.out.println("\"" + strWord + "\" is a palindrome!");
            } else {
            System.out.println("\"" + strWord + "\" is not a palindrome!");    
            }
        
    while (true) {
        System.out.print("\nDo you want to try again? (y/n): ");
        String choice = br.readLine();
        if (choice.equalsIgnoreCase("y")){
            break;
        } else if (choice.equalsIgnoreCase("n")){
            System.out.println("Exited Program!");
            return;
        } else {
            System.out.println("Invalid input, 'y' or 'n' are valid inputs!");
            continue;
        }
            }   
        }
    }
}    