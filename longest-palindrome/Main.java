import java.util.Scanner;
public class Main
{
    static int lps(String str)
    {
        int n = str.length();
        int i, j, cl;
        int[][] L = new int[n][n];
        for (i = 0; i < n; i++)
        	L[i][i] = 1;
        for (cl=2; cl<=n; cl++)
    	{
    		for (i=0; i<n-cl+1; i++)
    		{
    			j = i+cl-1;
    			if (str.charAt(i) == str.charAt(j) && cl == 2)
    			L[i][j] = 2;
    			else if (str.charAt(i) == str.charAt(j))
    			L[i][j] = L[i+1][j-1] + 2;
    			else
    			L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
    		}
    	}
    	return L[0][n-1];
    }
	public static void main(String[] args) {
	    System.out.println("Enter the string");
		String s = new Scanner(System.in).next();
		System.out.println(lps(s));
	}
}