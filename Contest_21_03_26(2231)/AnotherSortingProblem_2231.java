import java.util.Scanner;

public class AnotherSortingProblem_2231 {

    static long INF=(long)1e18;

    public static boolean isSort(int[] arr,int n){

        long[][] low=new long[n][2];
        long[][] high=new long[n][2];

        for(int i=0;i<n;i++){

            for(int j=0;j<2;j++){

                low[i][j]=INF;
                high[i][j]=-1;
            }
        }

        low[0][0]=1;
        high[0][0]=INF;

        low[0][1]=1;
        high[0][1]=INF;

        for(int i=0;i<n-1;i++){

            int d=arr[i]-arr[i+1];

            for(int x=0;x<2;x++){

                if(high[i][x]==-1)
                    continue;

                for(int y=0;y<2;y++){

                    long l=low[i][x];
                    long h=high[i][x];

                    if(x==y){

                        if(d>0)
                            continue;

                    }else if(x==0 && y==1){

                        l=Math.max(l,d);

                    }else{

                        h=Math.min(h,-d);
                    }

                    l=Math.max(l,1);

                    if(l<=h){

                        if(high[i+1][y]==-1){

                            low[i+1][y]=l;
                            high[i+1][y]=h;

                        }else{

                            low[i+1][y]=Math.min(low[i+1][y],l);
                            high[i+1][y]=Math.max(high[i+1][y],h);
                        }
                    }
                }
            }
        }

        return high[n-1][0]!=-1 || high[n-1][1]!=-1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-- > 0){

            int n=sc.nextInt();

            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            System.out.println(isSort(arr,n) ? "YES" : "NO");
        }

        sc.close();
    }
}