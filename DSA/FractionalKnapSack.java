public class FractionalKnapsack{
    static class Item{
        int weight;int value;double ratio;int index;
        Item(int weight,int value,int index){
            this.weight=weight;
            this.value=value;
            this.index=index;
            this.ratio=value/weight;
        }
    }
    public double knapsack(int[] values,int[] weights,int capacity){
        Item[] items=new Item[values.length];
        for(int i=0;i<values.length();i++){
            items[i].weight=weights[i];
            items[i].value=values[i];
            items[i].index=i;
        }
        Arrays.sort(items,new comparator{

        })
    }

}