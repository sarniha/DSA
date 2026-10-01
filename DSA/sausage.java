import java.util.*;
public class sausage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==k){
                System.out.println(2*n);
            }
            else{
                int sum=2*(k-1);
                sum+=Math.pow(2,n-k+1);
                System.out.println(sum);
            }
        }
    }
}