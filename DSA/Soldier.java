import java.util.Scanner;
public class Soldier{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++){
            sum+=i;
        }
        int cost=k*sum;
        System.out.print(cost-n>0?cost-n:0);
    }
}