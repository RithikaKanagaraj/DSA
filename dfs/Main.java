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
    void preorder(Node r){
       
        if(r==null){
        return;
        }
       System.out.print(r.value+" ");
        preorder(r.leftchild);
        preorder(r.rightchild);
    }
    void postorder(Node r){
        if(r==null){
            return;
        }
        postorder(r.leftchild);
        postorder(r.rightchild);
        System.out.print(r.value+" ");
    }
    void inorder(Node r){
        if(r==null){
            return;
        }
         inorder(r.leftchild);
        System.out.print(r.value+" ");
        inorder(r.rightchild);
    }
    public static void main(String args[]){
        Main n=new Main();
        
        Scanner in=new Scanner(System.in);
        int d,root;
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
        System.out.println("\n preorder: \n ");
           n.preorder(n.root);
           System.out.println("\npostorder: \n ");
           n.postorder(n.root);
           System.out.println("\nInorder:\n ");
           n.inorder(n.root);
        
        
    }
}

