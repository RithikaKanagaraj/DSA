import java.util.*;
class Main{
    Node root;
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
   public int height(Node root){
       if(root==null){
           return -1;
       }
       int left=height(root.leftchild);
       int right=height(root.rightchild);
       return(1+(Math.max(left,right)));
   
       }
   
    public static void main(String args[]){
        Main n=new Main();
        Scanner in=new Scanner(System.in);
        int d;
        System.out.println("ener data : ");
        while(true){
            d=in.nextInt();
            if(d==-1){
                break;
            }
                n.insert(d);
        }
        System.out.println("height :"+n.height(n.root));
    }
}
