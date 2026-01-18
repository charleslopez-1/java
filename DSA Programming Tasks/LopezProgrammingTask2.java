import java.util.Stack;
import java.io.*;

public class LopezProgrammingTask2 {
    static class Position {
        int row;
        int column;

        Position (int row, int column){
            this.row = row;
            this.column = column;
        }
    }

    public static void solveNQueens(int N){
        Stack<Position> s = new Stack<>();
        boolean success =  false;

        s.push(new Position(1,1));

        while(!success && !s.isEmpty()) {
            boolean conflict = hasConflict(s);

            if (conflict) {
                Position top = s.pop();
                while(!s.isEmpty() && top.column == N){
                    top = s.pop();
                }
            if (!s.isEmpty()) {
                
                s.push(new Position(top.row, top.column + 1));
            }
            } else if (s.size() == N){
                success = true;
            } else {
                s.push(new Position(s.size() + 1, 1));
            }
        }

        if (success) {
            System.out.println("SOLUTION FOUND for " + N + " - QUEENS PROBLEM");
            for (Position pos : s){
            System.out.println("ROW " + pos.row + ", COLUMN " + pos.column);
            }
        
    } else { 
        System.out.println("NO SOLUTION exists for " + N + " - QUEENS PROBLEM");
    }
}
    static boolean hasConflict(Stack <Position> s) {
        if (s.size() <= 1){
            return false;
        }

        Position top = s.peek();

        for (int i = 0; i < s.size() - 1; i++){
            Position other = s.get(i);

           if (top.row == other.row || top.column == other.column || Math.abs(top.row - other.row) == Math.abs(top.column - other.column)){
            return true;
           } 
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    while (true){
        System.out.print("Input value of N: ");
        int N = Integer.parseInt(rd.readLine());
            
        solveNQueens(N);

        while (true){
        String choice;
        System.out.print("\nDo you want to try another? (y/n): ");
        choice = rd.readLine();
        if (choice.equalsIgnoreCase("y")){
            break;
        } else if (choice.equalsIgnoreCase("n")){
            System.out.println("Program Terminated");
            return;
        } else {
            System.out.println("Invalid input, only 'y' or 'n' are accepted");
                }
            }
        } 
                 
    }
}
