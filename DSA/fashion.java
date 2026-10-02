public class fashion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int ele=sc.nextInt();
                map.put(ele,map.getOrDefault(ele,0)+1);
            
            }
            
        }
    }
}