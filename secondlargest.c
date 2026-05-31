#include <stdio.h>
int seclargest(int nums[],int n);
int main(){
    int nums[]={30,21,56,87,12};
    printf("%d",seclargest(nums,5));
    
}
int seclargest(int nums[],int n){
    int largest=nums[0];
    int seclargest=nums[0];


    for(int i=0;i<n;i++){
        if(nums[i]>largest)
        largest=nums[i];
        
    
    }
    for(int i=0;i<n;i++){
        if(nums[i]>seclargest&&nums[i]!=largest)
        seclargest=nums[i];
    }
    
    return seclargest;

}