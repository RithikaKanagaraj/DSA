import java.util.*;
public class Main{
	static int knapSack(int W, int wt[], int val[], int n)
	{
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);
		else
			return Math.max(val[n - 1]+knapSack(W - wt[n - 1], wt,val, n - 1),knapSack(W, wt, val, n - 1));
	}
	
	static int knapSackDP(int W, int wt[],int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1]+ K[i - 1][w - wt[i - 1]],K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        // for (i = 0; i <= n; i++)
        // {
        //     for (w = 0; w <= W; w++)
        //         System.out.print(K[i][w]+" ");
        //     System.out.println();
        // }
        return K[n][W];
    }
	
	public static void main(String args[])
	{
	   // Scanner input = new Scanner(System.in);
	   // System.out.println("Enter the size of the array:");
	   // int n = input.nextInt();
	   // int[] val = new int[n];
	   // int[] wt = new int[n];
	   // System.out.println("Enter the elements of the array:");
	   // for(int i=0;i<n;i++)
	   //     val[i] = input.nextInt();
	   // for(int i=0;i<n;i++)
	   //     wt[i] = input.nextInt();
	   // System.out.println("Enter the maximum weight:");
	   // int maxWt = input.nextInt();
		int[] val = { 10, 15, 5, 20, 25};
		int[] wt = { 1, 2, 3, 4, 5};
		int maxWt = 7;
		int n = val.length;
		System.out.println(knapSackDP(maxWt, wt, val, n));
	}
}