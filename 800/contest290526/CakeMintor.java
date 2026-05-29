package contest290526;

import java.util.*;

public class CakeMintor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        char [][] ch = new char[r][c];

        int[] row = new int[r];
        int[]col = new int[c];

        for (int i = 0; i < r; i++) {
            String str = sc.next();
            for (int j = 0; j < c; j++) {
                ch[i][j] = str.charAt(j);
            }            
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if(ch[i][j] == 'S'){
                    row[i] = 1;
                    col[j] = 1;
                }
            }            
        }

        int counter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(ch[i][j] == 'S' || (row[i] == 1 && col[j] == 1)) continue;
                counter++;
            }            
        }

        System.out.println(counter);

        sc.close();

    }
}
