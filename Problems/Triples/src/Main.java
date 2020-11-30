import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }


        int triples = 0;
        for (int i = 0; i < num.length-2; i++){
            if ((num[i+1] == num[i]+1) && num[i+2] == num[i] + 2 ){
                triples++;
            }
        }
        System.out.println(triples);

    }
}