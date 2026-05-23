// package Contest_21_03_26(2231);

import java.util.Scanner;

public class MaximumPrefixSums {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            // String s = sc.next();

            int a[] = new int[n];
            int c[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                c[i] = sc.nextInt();
            }

            int[] b = new int[n];
            b[0] = c[0] ;
            for(int i = 1; i < n; i++){
                b[i] = a[i] + b[i-1];
            }

            sc.close();

        }
    }

}
