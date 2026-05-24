
import java.util.Scanner;

public class Elephant_617A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long frndHouse = sc.nextLong();

        long step = (frndHouse%5) != 0 ? frndHouse/5+1 : frndHouse/5 ;

        System.out.println(step);
        
        sc.close();
    }
}