import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }
        int count = 0;
        int n = scanner.nextInt();
        for(int token : num){
            if (token>n){
                count += token;
            }
        }
        System.out.println(count);
    }
}