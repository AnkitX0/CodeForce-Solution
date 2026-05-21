import java.util.*;

public class petyaAndString_112A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firsString = sc.next().toLowerCase();
        String secondString = sc.next().toLowerCase();
        int index = 0;
        
        for (; index < firsString.length(); index++) {
            
            if(firsString.charAt(index) == secondString.charAt(index)) continue;
            
            else if(firsString.charAt(index) > secondString.charAt(index)) {
                System.out.println(1);
                break;
            }

            else {
                System.out.println(-1);
                break;
            }
       }

       if(index == firsString.length()) System.out.println(0);

        sc.close();
    }
}