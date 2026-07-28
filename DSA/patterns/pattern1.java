import java.util.Scanner;
public class pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}