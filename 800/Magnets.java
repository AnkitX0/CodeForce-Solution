
import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] str = new String[n];

        for(int i = 0; i < n; i++) str[i] = sc.next();

        int counter = 0;
        for(int i = 0; i < n - 1; i++){
            
            if(str[i].charAt(1) == str[i + 1].charAt(0)) {
                counter++;
            }
        }

        System.out.println(counter + 1);

        sc.close();
    }
}
