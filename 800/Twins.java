
import java.util.Arrays;
import java.util.Scanner;

public class Twins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int prefixSum[] = new int[n];

        prefixSum[0] = arr[0];
        for(int i = 1; i < n; i++) prefixSum[i] = prefixSum[i - 1] + arr[i];

        int suffixSum[] = new int [n];
        suffixSum[0] = arr[n - 1];

        for(int i = 1; i < n - 1; i++) suffixSum[i] = arr[ n - i - 1] + suffixSum[i - 1];

        // System.out.println(Arrays.toString(prefixSum));
        // System.out.println(Arrays.toString(suffixSum));

        int index = 0;

        while (index < n){
            if(suffixSum[index] > prefixSum[n - index - 1]) break;
            index++;
        }
        System.out.println(index + 1);
        sc.close();
        
    }
    
}
