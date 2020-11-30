import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] num = new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }
        int[] result = new int[num.length];
        result[0] = num[num.length-1];
        for (int i = 1; i < result.length; i++){
            result[i] = num[i-1];
        }


        for (int var : result){
            System.out.print(var + " ");
        }

    }
}