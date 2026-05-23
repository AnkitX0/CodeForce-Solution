import java.util.Scanner;

public class InSearchofanEasyProblem_1030A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean check = true;

        int[] response = new int[n];
        for(int i = 0; i < n; i++) response[i] = sc.nextInt();

        for(int i : response) {
            if(i == 1){
                check = false;
                break;
            }
        }

        System.out.println(check ? "Easy" : "Hard");

        sc.close();

    }
}
