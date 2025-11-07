import java.io.*;
public class PrimeFactors {
    public static void main(String[] args) throws IOException {
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Prime Factors of a Number === ");
        System.out.print("Enter a number: ");
        int intNum = Integer.parseInt(rd.readLine());

        int intTemp = intNum;

        System.out.println("Prime factors of " + intNum);
        for (int i = 2; i <= intTemp; i++){
            while (intTemp % i == 0){
                System.out.print(i + " ");
                intTemp /= i;
            }
        }
            rd.close();
    }
}
