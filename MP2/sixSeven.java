import java.io.*;

public class sixSeven {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            

        System.out.print("Enter a string: ");
        String strString = br.readLine().toLowerCase();
        
        String vowels = "[aeiou]";
        String consonants = "[bcdfghjklmnpqrstvwxyz]";

    
            strString = strString.replaceAll(vowels, "7");
        
            strString = strString.replaceAll(consonants, "6");
        

        System.out.println("Replaced String: " + strString);

        }
        

    }


