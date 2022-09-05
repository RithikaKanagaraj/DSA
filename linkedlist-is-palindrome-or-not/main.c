#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node{
    char data;
    struct node* next;
};
struct node* head=NULL;
void insert(char d){
    struct node* temp=head;
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=d;
    newnode->next=NULL;
    if(head==NULL){
        head=newnode;
        return;
    }
    else{
        temp=head;
        while(temp->next!=NULL){
        temp = temp->next;
        }
        temp->next=newnode;
    }
}

void palindrome(){
    struct node*s;
    struct node*f;
    struct node*prev;
    struct node*currentnode;
    struct node*nextnode;
    struct node*current;
     s=head;
            f=head;
           while(f!=NULL && f->next!=NULL){
               s=s->next;
               f=f->next->next;
           }
         
           prev=NULL;
            currentnode=s;
            nextnode=NULL;
           while(currentnode!=NULL){
               nextnode=currentnode->next;
               currentnode->next=prev;
               prev=currentnode;
               currentnode=nextnode;
           }
            current=head;
           while(prev!=NULL){
               if(current->data!=prev->data){
                   printf("not palindrome");
                   return;
               }
               else{
                   current=current->next;
                   prev=prev->next;
               }
           }
        printf("palindrome");
}
    
    
void print(){
    struct node* temp;
    
    if(head==NULL){
        printf("list is empty");
    }
    else{
        temp=head;
        while(temp!=NULL){
            printf("%c ",temp->data);
            temp=temp->next;
        }
    }
}

int main(){
    printf("\nenter the input " );
            char ch;
            while(1)
            {
                
                scanf(" %c",&ch);
                if(ch == '-')
                    break;
                insert(ch);
            }
           // print();
            palindrome();
}


