#include<stdio.h>
void reverse(int arr[],int s);
int main(){
    int nums[]={1,2,3,4,5};
    reverse(nums,5);
    

}
void reverse(int arr[],int s){
    int i=0,j=s-1;
    while(i<=j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        i++;
        j--;
    }
    for(int i=0;i<s;i++)
    printf("%d\n",arr[i]);
}