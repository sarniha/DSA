import java.util.Scanner;
public class NextRound{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] contestant=new int[n];
        for(int i=0;i<n;i++){
            contestant[i]=sc.nextInt();
        }
        int count=0;
        if(contestant[k-1]==0){
            for(int m=0;m<k-1;m++){
                if(contestant[m]>0)
                count++;
            }
            System.out.print(count);
            return;
        }

            
        count=k;

        for(int j=k;j<n;j++){
            if(contestant[j]==contestant[k-1]&&contestant[j]>0)
            count++;
            else
            break;
        }
        System.out.print(count);


    }
}