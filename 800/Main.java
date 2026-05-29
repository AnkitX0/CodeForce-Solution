
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }

        int m = sc.nextInt();
        int[][] bird = new int[m][2];
        for (int i = 0; i < m; i++) {
            bird[i][0] = sc.nextInt();
            bird[i][1] = sc.nextInt();
        }

        if(n == 0) System.out.println(0);
        else {
            
        }

        sc.close();
    }
}
