import java.util.HashMap;
import java.util.Scanner;

public class helpfulMaths_339A {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> count = new HashMap<>();

        String Equation = sc.next();
        for(Character ch : Equation.toCharArray()){
            
            if(ch == '1') count.put(1, count.getOrDefault(1, 0)+1 );
            else if( ch == '2') count.put(2, count.getOrDefault(2, 0)+1 );
            else if( ch == '3') count.put(3, count.getOrDefault(3, 0)+1 );
            else continue;
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 1; i <=3; i++){
            if(count.containsKey(i)){
                for(int j = 0; j < count.get(i); j++){
                    result.append(i);
                    result.append("+");
                }
            }
        }

        result.deleteCharAt(result.length()-1);

        System.out.println(result.toString());
        sc.close();
    }
}
