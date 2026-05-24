import java.util.*;

public class Bitpp282A{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int value = 0;

        for(int i = 0; i < n; i++){
            String str = sc.nextLine();

            char ch = str.charAt(1);
            
            if(ch == '+') value++;
            else value--;
            // System.out.println(str);
        }

        System.out.println(value);
        sc.close();
    }
}