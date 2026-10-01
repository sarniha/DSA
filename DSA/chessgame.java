import java.util.*;
public class chessgame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int tot=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                tot++;
            }
            else
            tot--;


        }
        if(tot<0){
            System.out.print("Danik");
        }
        else if(tot>0){
            System.out.print("Anton");
        }
        else{
            System.out.print("Friendship");
        }
    }
}