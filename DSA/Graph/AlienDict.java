import java.util.*;
class Solution{
    public String alien(String[] words){
        HashMap<Character,Integer> indegree=new HashMap<>();
        HashMap<Character,HashSet<Character>> graph=new HashMap<>();
        for(String s:words){
            for(char c:s.toCharArray()){
                indegree.putIfAbsent(c,0);
            }
        }
        for(int i=0;i<words.length-1;i++){
            String s1=words[i];
            String s2=words[i+1];
            int minlen=Math.min(s1.length(),s2.length());
            boolean found=false;
            for(int j=0;j<minlen;j++){
                char c1=s1.charAt(j);
                char c2=s2.charAt(j);
                if(c1!=c2){
                    if(!graph.get(c1).contains(c2)){
                        graph.get(c1).add(c2);
                        indegree.put(c2,indegree.get(c2)+1);
                    }
                    found=true;
                    break;
                }
            }
            if(!found&&s1.length()>s2.length()) return "";
        }
        Queue<Character> q=new LinkedList<>();
                for (char c : indegree.keySet())
            if (indegree.get(c) == 0) q.offer(c);

        StringBuffer sb=new StringBuffer();
        while(!q.isEmpty()){
            char comy=q.poll();
            sb.append(comy);
            if(graph.containsKey(comy)){
            for(char c:graph.get(comy)){
            indegree.put(comy, indegree.get(comy) - 1);

                if(indegree.get(c)==0){
                    q.offer(c);
                }
            }
            }

        }
        return sb.length()==indegree.size()?sb.toString():"";

    }
}