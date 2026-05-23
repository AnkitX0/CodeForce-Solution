import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int curLimit = 0;
        int maxLimit = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            curLimit = curLimit - a + b;

            maxLimit = curLimit > maxLimit ? curLimit : maxLimit;

        }
        System.out.println(maxLimit);

        sc.close();
    }
}
