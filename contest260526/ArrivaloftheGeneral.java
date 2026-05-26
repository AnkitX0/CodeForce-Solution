

import java.util.Scanner;

public class ArrivaloftheGeneral {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int t = -1;
        int j = -1;
        int maxi = Integer.MIN_VALUE;
        int minu = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){ 
            arr[i] = sc.nextInt();

            if(arr[i] >  maxi){
                maxi = arr[i];
                t = i; 
            }
            if( arr[i] <= minu){
                minu = arr[i];
                j = i;
            }
        }


        int result = t > j ? t + (n - j - 1) - 1 : t  + (n - j - 1);
        
        
        System.out.println(result);

        sc.close();
    }
}