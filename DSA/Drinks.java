import java.util.Scanner;
public class Drinks{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();float sum=0;        
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        System.out.print(sum/n);


    }
}