import java.util.Scanner;

public class dominoPilling_50A {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int total = m*n;

        int ans = total / 2;

        System.out.println(ans);
        sc.close();
    }
}
