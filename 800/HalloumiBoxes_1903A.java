import java.util.Scanner;

public class HalloumiBoxes_1903A {
    
    public void reverse(int[] arr, int left, int right){
        
        while(left <= right){
            int temp = arr[left];
            arr[left] = temp;
            arr[right] = arr[left];
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

            while();


        }
        
        sc.close();
    }
    
}
