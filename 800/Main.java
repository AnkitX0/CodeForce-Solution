
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // All Input
        int n = sc.nextInt();

        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        int m = sc.nextInt();
        int[][] u = new int[m][3];
        for (int i = 0; i < m; i++) {
            u[i][0] = sc.nextInt();
            u[i][1] = sc.nextInt();
            u[i][2] = sc.nextInt();
        }

        
        // operation perform
        long[] newV = v.clone();
        Arrays.sort(newV);

        long prefixSum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + newV[i];
        }

        long SprefixSum[] = new long[n + 1];
        for (int i = 0; i < n; i++) {
            SprefixSum[i + 1] = SprefixSum[i] + v[i];
        }

        // System.out.println(Arrays.toString(newV));
        for (int i = 0; i < m; i++) {
            
            int ver = u[i][0];
            long sum = 0;
            if(ver == 1){
                sum = SprefixSum[u[i][2]] - SprefixSum[u[i][1] - 1];
            }
            else{
                sum = prefixSum[u[i][2]] - prefixSum[u[i][1] - 1];
            }
            System.out.println(sum);

        }

        sc.close();
    }
    
}
