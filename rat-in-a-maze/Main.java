import java.util.*;
public class Main
{
    static int n,m;
    static boolean ratMultiSteps(int[][] maz, int x, int y, int[][] path) {
        if (x == n - 1 && y == m - 1) {
            path[x][y] = 1;
        return true;
        }
        if (x<0 || x>=n || y<0 || y>=m || maz[x][y] == 0)
            return false;
        path[x][y] = 1;
        for (int i = 1; i <= maz[x][y] && i < n; i++) {
             if (ratMultiSteps(maz, x + i, y, path))
                return true;
        }
        for (int i = 1; i <= maz[x][y] && i < m; i++) {
             if (ratMultiSteps(maz, x, y + i, path))
                return true;
        }
        path[x][y] = 0;
       return false;
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of the matrix:");
	    n = input.nextInt();
	    m = input.nextInt();
	    System.out.println("Enter the elements of the matrix");
	    int[][] maz = new int[n][m];
	    for(int i=0;i<n;i++)
	        for(int j=0;j<m;j++)
    	        maz[i][j] = input.nextInt();
        // int[][] maz =  {{ 2, 1, 0, 0, 0 },
        //                 { 3, 0, 0, 1, 2 },
        //                 { 0, 1, 0, 1, 0 },
        //                 { 0, 0, 0, 1 ,1}};
        int[][] path = new int[n][m];
        boolean ans = ratMultiSteps(maz,0,0,path);
    	if(ans){
	       System.out.println("Found");
    	   for(int i=0;i<n;i++){
    	       for(int j=0;j<m;j++)
    	        System.out.print(path[i][j]+" ");
    	       System.out.println();
    	   }
	   }
	   else
	    System.out.println("Not Found");
	}
}