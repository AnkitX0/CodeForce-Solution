import java.util.Scanner;

public class AntonandDanik_734 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        String game = sc.next();
        
        int Anton = 0;
        int Danik = 0;

        for(char ch : game.toCharArray()){
            if(ch == 'A') Anton ++;
            else Danik ++;
        }

        if(Anton > Danik) System.out.println("Anton");
        else if ( Danik > Anton) System.out.println("Danik");
        else System.out.println("Friendship");
        
        sc.close();
    }
}
