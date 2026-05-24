import java.util.Scanner;

public class BearandBigBrother_791A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int counter = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        while( a  <= b ) {
            a *= 3;
            b *= 2;
            counter ++;
        }
        System.out.println(counter);

        sc.close();
    }
}
