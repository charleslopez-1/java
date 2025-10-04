public class Main {
    public static void main(String[] args) {
        int num = 1;
        int sum_total = 0;

        while (num <= 100){
            sum_total += num;
            num++;

        }
        System.out.print("Sum of numbers are " + sum_total);
    }
}