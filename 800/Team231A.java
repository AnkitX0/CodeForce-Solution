import java.util.Scanner;
public class Team231A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        int count = 0;

        for(int b = 0; b < i; b++){
            int a = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            
            if(a+d+c >= 2) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
