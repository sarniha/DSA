public class lps{
    public String expand(int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i++;j--;
        }
        return s.substring(i+1,j);

    }
    public String longestpalindrome(String s){
        if(s.length()<=1){
            return s;
        }
                String maxStr = s.substring(0, 1);

        for(int i=0;i<s.length();i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(odd.length()>maxStr.length()){
                maxStr=odd;
            }
            if(even.length()>maxStr.length()){
                maxStr=even;
            }
        }
        return maxStr;
    }

}