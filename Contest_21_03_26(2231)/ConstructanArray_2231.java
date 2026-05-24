
import java.util.Scanner;
public class ConstructanArray_2231 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            for (int a = 1; a <= 2 * n - 1; a += 2) {
                sb.append(a).append(' ');
            }
            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}
