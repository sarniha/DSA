#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node* next;
};
struct node* START=NULL;
void create();
void insertatbeginning();
void deletefromb();
void display();
void address();
void insertonend();
void deletefromend();
void insertinbet();

int main(){
    int choice;
    
    
    while(1){
            printf("\nenter\n 1 for creation \n 2 for insertion \n 3 for deletion \n 4 for display \n 5 for exit\n 6 for printing address\n 7 for insertion on end\n 8 for deletion on end\n9 for insertion in between\n");
            scanf("%d",&choice);

        switch(choice){
            case 1:
            create();
            break;
            case 2:
            insertatbeginning();
            break;
            case 3:
            deletefromb();
            printf("\n%p",START);
            break;
            case 4:
            display();
            break;
            case 5:
            exit(0);
            break;
            case 6:
            address();
            break;
            case 7:
            insertonend();
            break;
            case 8:
            deletefromend();
            break;
            case 9:
            insertinbet();
            break;
            
            
            
            default:
            printf("\nentered wrong choice");
            break;
        }
    }
    

    return 0;

}
void create(){
    if(START!=NULL){
    printf("\n list already created");
    return;
    }
    struct node* temp;
    temp=(struct node*)malloc(sizeof(struct node));
    if(temp==NULL){
    printf("memory allocation failed");
    return;
    }
else{
    printf("\nenter data");
    scanf("%d",&temp->data);
    temp->next=NULL;

    START=temp;
}
}
void display(){
    struct node* temp=START;
    while(temp!=NULL){
    printf("->%d",temp->data);
    temp=temp->next;

    }
}
void insertatbeginning(){
    struct node* temp;

    temp=(struct node*)malloc(sizeof(struct node));
    printf("\nenter data");
    scanf("%d",&temp->data);
    temp->next=START;
    START=temp;
}
void deletefromb(){
    if(START==NULL)
    printf("\nMemory allocation failed");
    struct node* temp;
    temp=START;
    START=START->next;
    free(temp);

}
void address(){
    struct node* temp;
    temp=START;
    if(temp==NULL){
        printf("\nlist empty");
        return;
    }
    
    while(temp!=NULL){
        printf("\n%d:\n%p",temp->data,temp->next);
        temp=temp->next;
    }

}
void insertonend(){
    if(START==NULL){
        printf("\n list empty");
        return;
    }
    struct node* temp,*temp1;
    temp1=(struct node*)malloc(sizeof(struct node));
    
    printf("\nenter data to be inserted:");
    scanf("%d",&temp1->data);
    temp1->next=NULL;
    temp=START;
    while(temp->next!=NULL)
    temp=temp->next;
    temp->next=temp1;

}
void deletefromend(){
    if(START==NULL)
    return;
    if(START->next==NULL){
        free(START);
        START=NULL;
        return;
    }
    struct node* temp;
    temp=START;
    
    while(temp->next!=NULL){
        temp=temp->next;
    }
    free(temp);





}
void insertinbet(){
    if(START==NULL){
        printf("\n list empty");
        return;
    }
    int ele;struct node* temp,*temp1;
    
    temp=START;
    printf("\nenter element after which data has to be inserted:");
    scanf("%d",&ele);
    while(temp!=NULL&&temp->data!=ele){
        temp=temp->next;
    }
    if(temp==NULL){
        printf("\n element not found");
        return;
    }
    temp1=(struct node*)malloc(sizeof(struct node));
    if(temp1==NULL){
        printf("\n Memory Allocation failed");
        return;
    }
    printf("enter data in new node to be inserted");
    scanf("%d",&temp1->data);
    
    temp1->next=temp->next;
    temp->next=temp1;

}

