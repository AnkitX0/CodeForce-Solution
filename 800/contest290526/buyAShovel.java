package contest290526;
import java.util.Scanner;

public class buyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int k = sc.nextInt();
        int r = sc.nextInt();

        if(k % 10 == r) System.out.println(1);
        else{

            int mult = k;
            int counter = 1;
            while(mult % 10 != 0 && mult % 10 != r){
                mult +=  k;
                counter++;
            }
            System.out.println(counter);

        }
        sc.close();
    }
    
}
