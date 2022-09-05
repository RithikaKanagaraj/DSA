import java.util.*;
class Main{
   public Node root;
    public class Node{
        int value;
        Node leftchild,rightchild=null;
    
    Node(int value){
        this.value=value;
        leftchild=null;
        rightchild=null;
    }
    }
    
    void insert(int value){
        Node newnode=new Node(value);
        if(root==null){
            root=newnode;
            return;
        }
        else{
            Node temp=root;
            while(true){
                if(temp.value>newnode.value){
                  if(temp.leftchild==null){
                    temp.leftchild=newnode;
                    return;
                    }
                    else{
                        temp=temp.leftchild;
                    }
                }
                else{
                    if(temp.rightchild==null){
                    temp.rightchild=newnode;
                    return;
                    }
                    else{
                        temp=temp.rightchild;
                    }
                }
                
            }
        }
        
    }
     Node temp=root;
    void ancestor(Node temp,int a,int b){
         if(temp==null){
             System.out.println("not found");
             return;
         }
        if(a>temp.value && b>temp.value){
            ancestor(temp.rightchild,a,b);
        }
        else if(a<temp.value && b<temp.value){
            ancestor(temp.leftchild,a,b);
        }
        else{
            System.out.println(temp.value);
        }
        
    }
    public static void main(String args[]){
        Main n=new Main();
        
        Scanner in=new Scanner(System.in);
        int d,data,data1;
       
        System.out.println("enter elements ");
        while(true){
            d=in.nextInt();
            if(d==-1){
                break;
            }
            else{
               n.insert(d); 
            }
        }
        System.out.println("enter data: ");
        data=in.nextInt();
        data1=in.nextInt();
        n.ancestor(n.root,data,data1);
    }
}

