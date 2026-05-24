import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int lower = 0;
        int upper = 0;
        for(Character ch : word.toCharArray()){
            
            if(ch <= 'z' && ch >= 'a') lower++;
            else if (ch >= 'A' && ch <= 'Z') upper++;
        }

        System.out.println( lower >= upper ? word.toLowerCase() : word.toUpperCase());
        sc.close();
    }
}
