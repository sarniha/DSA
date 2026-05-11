import java.util.Scanner;
public class WrongSubs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        while(k>0){
            int rem=n%10;
            if(rem!=0) n=n-1;
            else if(rem==0) n=n/10;
            k--;
        }
        System.out.print(n);

    }
}