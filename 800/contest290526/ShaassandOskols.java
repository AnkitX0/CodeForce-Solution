package contest290526;

import java.util.Scanner;

public class ShaassandOskols {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        // Number of birds input
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
        }


        // xi and yi input 
        int m = sc.nextInt();
        int[][] bird = new int[m][2];
        for (int i = 0; i < m; i++) {
            bird[i][0] = sc.nextInt();
            bird[i][1] = sc.nextInt();
        }


        for(int i = 0; i < m; i++){
            int index = bird[i][0] - 1;
            int birdIndex = bird[i][1];

            if(index > 0){
                arr[index - 1] += birdIndex - 1;
            }
 
            if(index < n - 1){
                arr[index + 1] += arr[index] - birdIndex;
            }
 
            arr[index] = 0;
        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
