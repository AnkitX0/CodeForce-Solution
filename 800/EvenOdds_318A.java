import java.util.Scanner;

public class EvenOdds_318A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();   

        long result = 0;

        if( k <= (n + 1) / 2 ) result = (2 * k )  - 1;
        else result =( k - (n + 1) / 2 )* 2;
 
        System.out.println(result);
        sc.close();
    }
}
