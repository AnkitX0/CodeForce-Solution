import java.util.Scanner;

public class SoldierandBananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int money = 0;

        for(int i = 1; i <= w; i++){
            money += k*i;
        }

        System.out.println( money - n > 0 ? money - n : 0);

        sc.close();

    }
}
