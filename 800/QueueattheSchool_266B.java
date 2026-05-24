import java.util.Scanner;

public class QueueattheSchool_266B {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        
        String str = sc.next();
        // int left = 0;
        char[] ch = str.toCharArray();
        while(t > 0){

            int curr = 0;

            while(curr < n - 1){

                if(ch[curr] == 'B' && ch[curr + 1] == 'G'){
                    ch[curr] = 'G';
                    ch[curr + 1] = 'B';
                    curr += 2;
                }
                else curr++;
            }

            // if(ch[left] == 'G') left++;
            t--;

        }

        System.out.println(new String(ch));

        sc.close();
    }
}
