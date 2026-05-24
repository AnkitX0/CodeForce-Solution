import java.util.*;
public class wayTooLongWords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        for(int b = 0; b < i; b++){
            String word = sc.next();
            if(word.length() > 10){
                System.out.println(word.charAt(0) + Integer.toString(word.length()-2) + word.charAt(word.length()-1));  
            } 
            else {
                System.out.println(word);
            }
        }
        sc.close();
    }
}
