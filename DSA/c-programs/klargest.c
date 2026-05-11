#include<stdio.h>
int klargest(int arr[],int n,int k);
int main(){
        int nums[]={30,21,56,87,12};
    printf("%d",klargest(nums,5,2));


}
int klargest(int arr[],int n,int k){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr[n-k];

}
