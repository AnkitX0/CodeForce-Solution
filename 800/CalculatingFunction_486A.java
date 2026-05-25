 
import java.util.*;
 
public class CalculatingFunction_486A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
 
        long  n = sc.nextLong();
        long odd = (((n+1)/2) * ((n+1)/2));
 
        long ts=(n*(n+1))/2;
        long result = ts- (2 * odd);
 
       
 
        System.out.println(result);
 
        sc.close();
       
    }
}   