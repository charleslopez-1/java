import java.util.Scanner;

public class Name_age{

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age please: ");
        int Age = sc.nextInt();

        System.out.print("Hello " + name + ", you are " + Age + " years old");
        sc.close();
    }
}
