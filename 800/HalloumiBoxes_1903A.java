import java.util.Scanner;

public class HalloumiBoxes_1903A {
    
    public static void reverse(int[] arr, int left, int right){
        
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int a = 0; a < n; a++) arr[a] = sc.nextInt();

            while(k > 0){
                reverse(arr, 0, n-1);
                reverse(arr, 0, k-1);
                reverse(arr, k, n-1);
                k--;
                dsvvs
            }

        }
        
        sc.close();
    }
    
}
