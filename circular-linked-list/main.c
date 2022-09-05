 #include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node* next;
};
struct node* head;

void append(int d){
    struct node* temp=head;
    struct node* newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=d;
    newnode->next=NULL;
    if(head==NULL){
        head=newnode;
    }
    else{
        while(temp->next!=head){
            temp=temp->next;
        }
        temp->next=newnode;
    }
    newnode->next=head;
}
void print(){
    struct node* temp;
    if(head== NULL){
        printf("list is empty");
    }
    else{
        temp=head;
        do{
        printf("%d ",temp->data);
        temp=temp->next;
        }while(temp!=head);
    }
}
void delete(){
     struct node* temp;
    struct node* p;
    if(head==NULL){
        printf("list is empty");
        return;
    }
    
    if(head->next == head)
    {
        head = NULL;
        return;
    }
    
    p=temp=head;
    while(temp->next!=head){
        p=temp;
        temp=temp->next;
    
    }
    p->next=head;
    free(temp);
    
}

int main(){
    int d,opt,i,n;
    printf("1 for insert \n2 for print \n3 for delete at end  \n4 for exit");
    while(opt!=0){
        printf("\n enter option ");
       scanf("%d",&opt);
    switch(opt){
        case 1:
        
        printf("\n enter data: ");
         scanf("%d",&d);
            append(d);
       break;
     
     
    case 2:
    print();
    break;
    case 3:
    delete();
    break;
    case 4: return 0;
    }
    }
}






