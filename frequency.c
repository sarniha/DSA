#include<stdio.h>
int frequency(int arr[],int s,int n);
int main(){
    int nums[]={1,2,1,1,3,2,2,3};
    printf("%d",frequency(nums,8,2));

}
int frequency(int arr[],int s,int n){
    int count=0;
    for(int i=0;i<s;i++){
        if(arr[i]==n)
        count++;
    }
    return count;
}