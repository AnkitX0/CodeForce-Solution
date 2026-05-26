
import java.util.Scanner;


public class SerejaandDima {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n-1;

            int scoreSerej = 0;
            int scoreDime = 0;

            while(left <= right){

                if(arr[left] > arr[right]) scoreSerej += arr[left++];
                else scoreSerej += arr[right--];

                if(left > right) break;

                if(arr[left] > arr[right]) scoreDime += arr[left++];
                else scoreDime += arr[right--];

            }

            System.out.println(scoreSerej + " " + scoreDime);

            sc.close();
        }
}
