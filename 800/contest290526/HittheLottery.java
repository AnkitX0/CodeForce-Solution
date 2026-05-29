// package contest290526;

import java.util.Scanner;

public class HittheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();



        int bills = 0;

        if( n >= 100 ){
            bills += n / 100;
            n = n % 100;
        }
        
        if( n >= 20 ){
            bills += n / 20;
            n = n % 20;
        }
        if( n >= 10 ){
            bills += n / 10;
            n = n % 10;
        }
        if( n >= 5 ){
            bills += n / 5;
            n = n % 5;
        }
        if( n >= 1){
            bills += n;
        }

        System.out.println(bills);
        
        sc.close();
    }
}
