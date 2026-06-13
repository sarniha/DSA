import java.util.Scanner;
class ConstructArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
       StringBuffer sb=new StringBuffer();
       for(int i=1;i<n;i++){
        sb.append(2*i-1+" ");
        if(i<n)
        sb.append(" ");
       }
       System.out.println(sb);
        }
    }
}