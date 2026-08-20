import java.util.Scanner;
public class PoisonedDagger_1613C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            long h = sc.nextLong();
            
            int arr[] = new int[n];
            for (int idx = 0; idx < n; idx++) {
                arr[idx] = sc.nextInt();               
            }

            long low = 1, high = h;
            
            long ans = 0L;
            while(low <= high){
                long mid = low + (high-low) / 2;

                if(dead(mid, arr, h)){
                    ans = mid;
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            System.out.println(ans);
        }
    }

    public static boolean dead(long k, int[]arr, long h){

        long damage = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            damage += Math.min(k, arr[i+1] - arr[i]);   
        }
        damage+= k;
        if(damage >= h) return true;
        return false;
    }   
}
