
import java.util.Scanner;

public class WordCapitalization_281A{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        if(word.length() == 0){
            System.out.println(word);
        }

        else if(word.length() == 1){
            System.out.println(word.toUpperCase());
        }
        else System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        sc.close();

    }
}