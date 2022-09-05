
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node{
    char data;
    struct node* next;
};
struct node* head=NULL;

struct StackNode {
    char data;
    struct StackNode *next;
};
struct StackNode* top = NULL;

void push(int value) {
    struct StackNode *newNode;
    newNode = (struct StackNode *)malloc(sizeof(struct StackNode));
    newNode->data = value; 
    if (top == NULL) {
        newNode->next = NULL;
    } else {
        newNode->next = top; 
    }
    top = newNode; 
}

char pop() {
        struct StackNode *temp = top;
        char temp_data = top->data;
        top = top->next;
        free(temp);
        return temp_data;
}



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
    s=head;
    f=head;
    
    
    
   while(f!=NULL && f->next!=NULL){
       push(s->data);
       s=s->next;
       f=f->next->next;
   }
   
    if(f != NULL)
        s = s->next;
        
    while(s != NULL)
    {
        if(s->data != pop())
        {
            printf("Not a palindrome");
            return;
        }
        
        s = s->next;
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



