#include <stdio.h>
#include <stdlib.h>
struct Node{
    int data;
    struct Node* next;
};
struct Node *front=NULL;
struct Node *rear=NULL;

void append(int d){
    struct Node* newnode=(struct Node*)malloc(sizeof(struct Node)); 
 newnode->data=d;
 newnode->next=NULL;
if(rear==NULL){
    front=rear=newnode;
}
else{
    rear->next=newnode;
    rear=newnode;
}
}
void print(){
    struct Node* temp;
    if(front==NULL){
        printf("queue is empty");
    }
    else{
            temp=front;
            while(temp){
                printf("%d",temp->data);
                temp=temp->next;
            }
    }
}
void dequeue(){
    struct Node* temp;
    temp=front;
    if(front==NULL){
        printf("queue is empty");
    }
    else{
        front=front->next;
        if(front == NULL)
            rear = NULL;
        free(temp);
    }
}
int main(){
    int opt,n,i,data;
    printf("1 for enqueue \n2 fo print \n3 for dequeue \n4 for exit ");
    while(opt!=0){
        printf("\nenter option "); 
    scanf("%d",&opt);
    
    switch(opt){
        case 1:
            printf("enter data: ");
            scanf("%d",&data);
            append(data);
        break;
        
        case 2:
        print();
        break;
        
        case 3:
        dequeue();
        break;
        case 4:
        return 0;
    }
    }
}







