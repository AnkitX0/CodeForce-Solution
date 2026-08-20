
import java.util.*;

public class HemoseShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            // System.out.println(Arrays.toString(arr));
            System.out.println(checkSort(arr, x, n) ? "YES" : "NO");
        }
    }

    private static  boolean checkSort(int[] arr, int x, int n ){
        
        if(2 *x <= n) return true;

        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        // boolean check = true;
        for(int i  = n - x; i < x; i++){
            if(arr[i] != sortArr[i]) return false;
        }
        return true;
    }
}
