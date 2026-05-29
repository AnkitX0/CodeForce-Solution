
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int copy = n;

        int team[][] = new int[n][2];
        int i = 0;
        while(n-- > 0){
            team[i][0] = sc.nextInt();
            team[i][1] = sc.nextInt();
            i++;
        }

        int counter = 0;
        for(int k = 0; k < copy; k++){
            for(int j = 0; j < copy; j++){
                
                if(k == j) continue;
                if(team[k][0] == team[j][1]) counter++;

            }
        }
        System.out.println(counter);

        sc.close();
    }
}
