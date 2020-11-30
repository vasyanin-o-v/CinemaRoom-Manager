import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[scanner.nextInt()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        int multiply = 1;
        for (int i = 0; i < ints.length - 1; i++) {
            int i1 = ints[i] * ints[i + 1];
            if (i1 > multiply) {
                multiply = i1;
            }
        }
        System.out.println(multiply);
    }
}
