#include <stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* next;
};
struct node* head1;
struct node* head2;
void insert(struct node** head,int d){
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=d;
    newnode->next=NULL;
    if(*head==NULL){
        *head=newnode;
    }
    else{
        struct node* temp= *head;
        while(temp->next!=NULL)
        {
            temp= temp->next;
        }
        temp->next = newnode;
    }
}

void merge(struct node* h1,struct node* h2){
    struct node* temp1=h1;
    struct node* temp2=h2;
    struct node* a;
    struct node* b;
    if(h1==NULL){
        head1=h2;
        return;
    }
    if(h2==NULL){
        return;
    }
    else{
    do{
        a=temp1->next;
        b=temp2->next;
        temp1->next=temp2;
        if(a!=NULL){
             temp2->next=a;
        }
        temp1=a;
        temp2=b;
        }while(temp1!=NULL && temp2!=NULL);
   
    }
    return;
}
void print(struct node *head){
    struct node* temp;
    if(head==NULL){
        printf("list is empty");
    }
    else{
        temp=head;
       while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
        }
    }
    }
int main(){
    int data;
    printf("\nenter the data: ");
   do{
        scanf("%d",&data);
            if(data==-1)
                break;
           
            else{
                insert(&head1,data);
            }
        }while(data!=-1);
    printf("\nenter the data: ");
    do{
        scanf("%d",&data);
            if(data==-1)
                break;
           
            else{
                insert(&head2,data);
            }
        }while(data!=-1);
    merge(head1,head2);
    print(head1);
}
