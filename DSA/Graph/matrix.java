import java.util.Scanner;
public class matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] adjmatrix=new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adjmatrix[u][v]=1;
            adjmatrix[v][u]=1;
        }
        sc.close();
    }
}