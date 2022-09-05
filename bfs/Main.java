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
   public void order(Node root){
       
       Queue<Node> q=new LinkedList<>();
       
       if(root==null){
           return;
       }
       q.add(root);
       while(!q.isEmpty()){
         
         int size=q.size();
         for(int i=0;i<size;i++){
             Node k=q.remove();
             System.out.print(k.data+" ");
             if(k.leftchild!=null){
                 q.add(k.leftchild);
             }
              if(k.rightchild!=null){
                 q.add(k.rightchild);
             }
             
         }
         System.out.println();
       }
       
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
        n.order(n.root);
    }
}


