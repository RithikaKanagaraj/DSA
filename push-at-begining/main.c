#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* next;
};
struct node* head;

void insert(int d)
{
    struct node* temp=head;
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=d;
    newnode->next=NULL;
    
    if(head==NULL)
    {
        head=newnode;
    }
    else
    {
        temp=head;
        while(temp->next!=NULL)
        {
        temp=temp->next;
        }
        temp->next=newnode;
    }
}
void push(int v)
{
    struct node* temp=head;
    struct node* p=temp;
    
    if(head->data==v)
    {
        return;
    }
    else
    {
       while(temp->data!=v)
    {
         p=temp;
        temp=temp->next;
        
        if(p->next==NULL)
        {
            printf("not found");
            return;
        }
        
    }
    
            p->next=temp->next;
            temp->next=head;
            head=temp;
            }
}
void print()
{
    struct node* temp;
    if(head==NULL)
    {
        printf("list is empty");
    }
    else
    {
        temp=head;
        
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
    }
}
int main(){
    int data,opt,value;
        printf("\nenter data ");
        do
        {
        scanf("%d",&data);
        
            if(data==-1)
                break;
           
            else{
                insert(data);
            }
            
        }while(data!=-1);
        
        print();
        
        while(1)
        {
        printf("\nenter value ");
        scanf("%d",&value);
        
        if(value==-1)
            break;
            
        push(value);
        
        print();
        
        }
    }






