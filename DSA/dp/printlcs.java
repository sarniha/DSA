class Solution{
    StringBuffer s;

    public void lcs(int i,int j,String word1,String word2){
        
        if(word1.charAt(i)==word2.charAt(j)){
            s.append(word1.charAt(i));
            lcs(i+1,j+1,word1,word2);

        }
        lcs(i+1,j,word1,word2);
        lcs(i,j+1,word1,word2);
        
    }
}