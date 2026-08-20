import java.util.Scanner;

public class AShooshunsAndSequence{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int result = -1;

        int target = arr[n - 1];

        for(int i = n - 1; i >= 0; i--){
            if(target != arr[i]) {
                result = i;
                break;
            } 
        }

        if (result == -1) {
            System.out.println(0);
        }
        else if (k == 1) {
            System.out.println(-1);
        }
        else {
            System.out.println(result + 1);
        }

        sc.close();
    }
}