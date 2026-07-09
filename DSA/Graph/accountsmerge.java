import java.util.*;
class dsu{
    int[] parent;
    int[] size;
    dsu(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int find(int node){
        if(parent[node]==node) return node;
        return parent[node]=find(parent[node]);

    }
    public void union(int u,int v){
        int parU=find(u);
        int parV=find(v);
        if(parU==parV) return;
        if(parU<parV){
            parent[parU]=parV;
            size[parV]+=size[parU];
        }
        else if(parU>parV){
            parent[parV]=parU;
            size[parU]+=size[parU];
        }
    }

}
class Solution{
    public List<List<String>> accountsmerge(List<List<String>> accounts){
        int n=accounts.size();
        dsu d=new dsu(n);
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail=accounts.get(i).get(j);
                if(!map.containsKey(mail)){
                    map.put(mail,i);
                }
                else{
                    d.union(i,map.get(mail));
                }
            }
        }
        HashMap<Integer,List<String>> merged=new HashMap<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String email=entry.getKey();
            int account=entry.getValue();
            int parent=d.find(account);
            merged.putIfAbsent(parent,new ArrayList<>());
            merged.get(parent).add(email);
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<Integer,List<String>> entry:merged.entrySet()){
            int account=entry.getKey();
            List<String> emails=entry.getValue();
            Collections.sort(emails);
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(account).get(0));
            temp.addAll(emails);
            ans.add(temp);

        }
        return ans;

    }
}