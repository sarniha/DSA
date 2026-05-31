import java.util.Scanner;
public class Stones{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();String s="";int count=0;
        for(int i=0;i<n;i++){
            char c=sc.next().charAt(0);
            if(s.length()>0&&s.charAt(s.length()-1)==c)
            count++;
            s=s+c;


        }
        System.out.print(count);

    }
}