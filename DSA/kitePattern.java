package DSA;

import java.util.Scanner;

public class kitePattern {
    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 0;i < n; i++){
	        int div = n/2;
	        for(int j = 0; j < n; j++){
	            
	            if(j == div || i == div || div-i == j || div +i == j ||i+j == n-1 +div  || i-div == j )  System.out.print("*");
	            
                // Equation => div-i == j ( / "Upper")
                // Equation => div +i == j  (\ "Upper")
                // Equation => i-div == j(\ " below")
                // Equation =>  i+j == n-1 +div (/ "Below")
	            
                else    System.out.print(" ");
	            
	        }
	        System.out.println();
	        
	    }
        sc.close();
	}
}
