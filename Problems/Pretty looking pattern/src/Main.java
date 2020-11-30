import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++){
            String a = scanner.nextLine();
            char[] b = a.toCharArray();
            for (int j = 0; j < 4; j ++){
                matrix[i][j] = b[j];
            }
        }
        int count = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if (matrix[i][j] == matrix[i][j+1] && matrix[i][j] == matrix[i+1][j] && matrix[i][j] == matrix[i+1][j+1]){
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}