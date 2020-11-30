import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int[][] anotherMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int rowNum = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {

                if (matrix[i][j]==0){
                    count++;
                    anotherMatrix[i][j] = count;
                    if (count == k) {
                        rowNum = i + 1;
                        break;
                    }
                }
                else {
                    count = 0;
                }
            }
            if(rowNum != 0){
                break;
            }

        }

        //System.out.println("count: " + count);
        System.out.println(rowNum);


        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(anotherMatrix[i][j]);
            }
            System.out.println();
        }*/
    }
}