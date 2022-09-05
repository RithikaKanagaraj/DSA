import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the size of the matrix");
	    int m = input.nextInt();
	    int n = input.nextInt();
// 		int[][] a =
// 		{
// 		    {1,2,3,4,5,26,27},
// 		    {6,7,8,9,10,28,29},
// 		    {11,12,13,14,15,30,31},
// 		    {16,17,18,19,20,32,33},
// 		    {21,22,23,24,25,34,35}
// 		};
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                a[i][j] = input.nextInt();
        }
        int[][] mat = new int[m][n];
        int inI=0,inJ=0,x=m,y=n;
        int i, k = 0, l = 0;
        while (k<m && l<n) {
            for (i=l;i<n;i++){
                if(inJ==y)
                {
                    inJ=0;
                    inI++;
                }
                    mat[inI][inJ++] = a[k][i];
                // System.out.print(a[k][i] + " ");
            }
            k++;
            for (i=k;i<m;i++){
                if(inJ==y)
                {
                    inJ=0;
                    inI++;
                }
                mat[inI][inJ++] = a[i][n-1];
                // System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k<m){
                for (i=n-1;i>=l;i--) {
                    if(inJ==y)
                    {
                        inJ=0;
                        inI++;
                    }
                    mat[inI][inJ++] = a[m-1][i];
                    // System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l<n){
                for(i=m-1;i>=k;i--) {
                    if(inJ==y)
                    {
                        inJ=0;
                        inI++;
                    }
                    mat[inI][inJ++] = a[i][l];
                    // System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        for(i=0;i<x;i++){
            for(k=0;k<y;k++)
                System.out.print(mat[i][k]+" ");
            System.out.println();
        }
	}
}