
import java.math.BigInteger;
import java.util.*;

public class CalculatingFunction_486A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        long  n = sc.nextLong();

        BigInteger x = BigInteger.valueOf(n);
        
        BigInteger odd = (((x+1)/2) * ((x+1)/2));

        BigInteger ts=(n*(n+1))/2;

        BigInteger even = ts- odd;
        BigInteger result = even - odd;

       

        System.out.println(result);

        sc.close();
       
    }
}   