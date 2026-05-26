
import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int crime = 0;
        int police = 0;
        for(int i : arr){
            
            if(i > 0 ) police += i;

            else if(i == -1 && police > 0) {
                police--;
            }
            else crime++;

        }

        System.out.println(crime);
    }
}
