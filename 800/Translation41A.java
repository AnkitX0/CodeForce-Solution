import java.util.Scanner;

public class Translation41A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String  s = sc.next();
        String t = sc.next();

        boolean check = true;
        int size = s.length();

        if(s.length() != t.length()) check = false;
        else
        {
                
            for(int i = 0; i < size; i++){
                if(s.charAt(i) != t.charAt(size-i-1)) {check = false; break;}
            }
        }

        System.out.println(check ? "YES" : "NO");
        

        sc.close();

    }
}
