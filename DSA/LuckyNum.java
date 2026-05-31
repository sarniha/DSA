import java.util.Scanner;
public class LuckyNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();  int count=0;
        while(n>0){
            if(n%10==7||n%10==4)
            count++;
            
            n=n/10;
        }
        if(count==4||count==7)
        System.out.print("YES");
        else
        System.out.println("NO");
    }
}