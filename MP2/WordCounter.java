import java.io.*;
public class WordCounter {
    public static void main(String[] args) throws IOException {
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
        System.out.println("=== Word counter ===");
        System.out.print("Enter a phrase/sentence: ");
        String str = br.readLine();

        String[]counter = str.split(" ");
        System.out.println("Number of words in your input: " + counter.length);
        
    while (true){    
            System.out.print("Do you want to try again? (y/n): ");
            String choice = br.readLine();
                if (choice.equalsIgnoreCase("y")){
                    break;
                } else if (choice.equalsIgnoreCase("n")){
                    System.out.println("Exiting program...");
                    return;
                } else {
                    System.out.println("Invalid input! 'y' or 'n' only!");
                    continue;
                }
                }
            }
        }
    }
