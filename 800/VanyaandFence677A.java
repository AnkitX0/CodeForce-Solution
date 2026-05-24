import java.util.Scanner;

public class VanyaandFence677A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] height = new int[n];
        for(int i = 0; i < n; i++)  height[i] = sc.nextInt();

        int count = 0;

        for(int i : height){
            if(i > h) count ++;
            count++;
        }

        System.out.println(count);

        sc.close();
    }
}
