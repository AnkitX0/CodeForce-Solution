package DSA;

import java.util.Scanner;

public class createA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
 
         for (int i = 0; i < n; i++){
            
            for(int j = 0; j < (n/2)+1; j++){

                if( i == 0 && j == 0 || i == 0 && j == (n/2)) System.err.print(" ");

                else if( j == 0 || i == 0 || j == (n/2) || i == (n/2)) System.err.print("*");

                else System.err.print(" ");
            }

            System.err.println();
         }
         sc.close();
    }
}
