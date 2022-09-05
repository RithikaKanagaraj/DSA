import java.util.*;
class Main{
    Node root;
    int s=0;
    class Node{
        int data;
        Node leftchild,rightchild;
        Node(int data){
            this.data=data;
            leftchild=rightchild=null;
        }
    }
    
    class temp{
        Node node;
        int hd;
        temp(Node node,int hd){
            this.hd=hd;
            this.node=node;
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
    void vertical(Node root){
        TreeMap<Integer,List<Integer>> tm=new TreeMap<>();
        Queue<temp> q =new LinkedList<temp>();
        
        if(root==null){
           return;
       }
        q.add(new temp(root,0));
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                temp t=q.remove();
                if(!tm.containsKey(t.hd))
                {
                List<Integer> l = new ArrayList<>();
                tm.put(t.hd, l);
                }
                 tm.get(t.hd).add(t.node.data);
                 
                 if(t.node.leftchild!=null){
                     q.add(new temp(t.node.leftchild, t.hd - 1));
                 }
                 
                 if(t.node.rightchild!=null){
                     q.add(new temp(t.node.rightchild,t.hd+1));
                 }
            }
        }
        for(Map.Entry<Integer, List<Integer>> entry : tm.entrySet())
        {
            for(int i : entry.getValue())
                System.out.print(i+ " ");
            System.out.println();
        }
        
    }
    
    
      public static void main(String args[]){
        Main n=new Main(); 
        Scanner in=new Scanner(System.in);
        int d;
        System.out.println(" enter data: ");
        while(true){
            d=in.nextInt();
            if(d==-1)
                break;
            n.insert(d);
        }
        System.out.println("vertical traverse: ");
        n.vertical(n.root);
        
    }
}


