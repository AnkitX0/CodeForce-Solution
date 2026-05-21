import java.util.*;

public class nextRound_158A{

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++) arr.add(sc.nextInt());
        
        for(int i : arr){

            if(i==0 || i < arr.get(k-1)) break;
            else count++;
        }

        System.out.println(count);
        sc.close();
    }
}