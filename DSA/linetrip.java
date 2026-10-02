import java.util.*;
public class linetrip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] gas=new int[n];
            for(int i=0;i<n;i++){
                gas[i]=sc.nextInt();
            }
            int max=gas[0];
            for(int i=1;i<n;i++){
                
                max=Math.max(max,gas[i]-gas[i-1]);
            }



            
            if(max>=2*(x-gas[n-1])){
                
            }
            else{
                max+=(2*(x-gas[n-1])-max);
            }
            System.out.println(max);

        }
    

    }
}