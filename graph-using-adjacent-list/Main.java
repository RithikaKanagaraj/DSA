import java.util.*;
class Graph
{
    Map<Integer, List<Integer>> vertices = new HashMap<>();
    void addVertex(int n)
    {
        vertices.put(n, new LinkedList<Integer>());
    }
    void addEdge(int src, int des)
    {
        if (!vertices.containsKey(src))
            addVertex(src);
        if (!vertices.containsKey(des))
            addVertex(des);
        if(!vertices.get(src).contains(des))
            vertices.get(src).add(des);
        if(!vertices.get(des).contains(src))
            vertices.get(des).add(src);
    }
    void printAdjList(){
        for (Integer vertex: vertices.keySet()){
            System.out.println(vertex +"  => "+vertices.get(vertex));
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Graph g = new Graph();
        System.out.println("Enter the edges of the graph: ");
        int src=0,des=0;
        do
        {
            src = input.nextInt();
            des = input.nextInt();
            
            if(src>-1 && des>-1)
            g.addEdge(src,des);
            
        }while(src!=-1 && des!=-1);
        System.out.println("Adjacency list of the graph:");
        g.printAdjList();
}
}
