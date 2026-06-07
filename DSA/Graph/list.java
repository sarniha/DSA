import java.util.Scanner;
public class list{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer>[] adjlist=new ArrayList[n+1];
                for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adjlist[u].add(v);
            adjlist[v].add(u);
        }

    }
}