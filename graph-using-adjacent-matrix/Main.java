import java.util.*;
class Graph
{
    int[][] edges;
    int v;
    Graph(int v)
    {
        this.v = v;
        edges = new int[v+1][v+1];
    }
   
    public void addEdge(int s, int d)
    {
        if(s > v || d > v)
        {
            System.out.println("Enter Valid Source/Destination vertex");
            return;
        }
        edges[s][d] = 1;
        
    } 
    
    public void print()
    {
        for(int i=1;i<=v;i++)
        {
            System.out.print(i + " --> ");
            for(int j=1;j<=v;j++)
            {
                if(edges[i][j] == 1)
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Enter Initial Number of vertex : ");
	    int v = sc.nextInt();
	   
	    Graph graph = new Graph(v);
	
         
		             while(true)
		                {
		                    int s = sc.nextInt();
		                    int d = sc.nextInt();
		                   
		                    if(s == -1 || d == -1)
		                        break;
		                    graph.addEdge(s, d);
		                }
		                //graph.addVertex();
		                graph.print();
		            
		        
		
	}
}

