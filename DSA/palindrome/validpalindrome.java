public class validpalindrome{
    public static boolean ispalindrome(String s){
        String s1=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i=0;int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(ispalindrome("saudagarHUN"));

    }
}