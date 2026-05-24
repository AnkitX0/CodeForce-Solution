import java.util.Scanner;

public class StonesontheTable_266A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.next();
        int count = 0;
        Character prev = 'a';
        for(Character ch : stones.toCharArray()){
            if(ch == prev) count++; 
            prev = ch;
        }

        System.out.println(count);
        sc.close();
    }
}
