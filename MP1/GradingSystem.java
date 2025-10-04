import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int STUDENT_SIZE;    
    int passed = 0;
    int failed = 0;
    
    int sum = 0;
    int highest = Integer.MIN_VALUE;
    int lowest = Integer.MAX_VALUE;
        
        System.out.print("Enter number of students: ");
        STUDENT_SIZE = sc.nextInt();

        int[] grades = new int [STUDENT_SIZE];

        System.out.println("\n=== STUDENT GRADING SYSTEM ===\n");
    for (int i = 0; i < STUDENT_SIZE; i++){
        System.out.print("Enter grade for student #" + (i + 1) + ": ");
        grades[i] = sc.nextInt();

            sum += grades[i];

            if (grades[i] > highest){
                highest = grades[i];
            }

            if (grades[i] < lowest){
                lowest = grades[i];
            }       
    }
        double average = (double) sum / STUDENT_SIZE;

        System.out.println("\n=== SUMMARY ===");
        System.out.print("\nHighest Grade = " + highest);
        System.out.print("\nLowest Grade = " + lowest);
        System.out.println("\nAverage: " + average);

        System.out.println("\n=== REMARKS OF STUDENTS === ");
        for (int i = 0; i < STUDENT_SIZE; i++){

            String remark;

            if (grades[i] >= 90){
                remark = "Excellent";
                passed++;
                if (grades[i] > 95){
                    
                }
            } else if 
                (grades[i] >= 80){
                remark = "Very Good";
                passed++;
            } else if 
                (grades[i] >= 75){
                remark = "Good";
                passed++;
            } else {
                remark = "Failed";
                failed++;
            }
            System.out.println("Student #" + (i + 1) + ": " + grades[i] + " - " + remark);
            }
            System.out.println("\nPassed: " + passed);
            System.out.println("Failed: " + failed);

        sc.close();
        }
    }


