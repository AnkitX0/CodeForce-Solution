// import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BoysOrGirl_236A{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Character> distint = new HashSet<>();

        String userName = sc.next();
        int size = 0;

        for(Character ch : userName.toCharArray()){

            if(distint.contains(ch)) continue;
            distint.add(ch);
            size++;
        }
        

        if(size % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        sc.close();
    }

}