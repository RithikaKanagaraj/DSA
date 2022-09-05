import java.util.*;
class Main{
    Node root;
    int s=0;
    class Node{
        int data;
        Node leftchild,rightchild=null;
        Node(int data){
            this.data=data;
            leftchild=rightchild=null;
        }
    }
    void insert(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
            return;
        }
        else{
            Node temp=root;
            while(true){
                if(newnode.data<temp.data){
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
    
    int sum(Node root){
        if(root==null){
            return 0;
        }
        if((root.leftchild==null && root.rightchild!=null)||(root.leftchild!=null && root.rightchild==null)){
            s+=root.data;
            return s;
        }
        
        sum(root.leftchild);
        sum(root.rightchild);
    
    return s;
    
    }
    
      public static void main(String args[]){
        Main n=new Main(); 
        Scanner in=new Scanner(System.in);
        int d;
        while(true){
            d=in.nextInt();
            if(d==-1)
                break;
            n.insert(d);
        }
        System.out.println("sum of singlechild: "+n.sum(n.root));
    }
}


