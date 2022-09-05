import java.util.Scanner;
public class Main
{
    static String s="";
    static int n,m,ss;
    static boolean findString(int i,int j,int c,char[][] mat)
    {
        if(i>=n || j>=m || i<0 || j<0 || c>=ss)
            return false;
        if(s.charAt(c)==mat[i][j])
        {
            mat[i][j]='#';
            if(c==ss-1){
                return true;
            }
            if(findString(i,j+1,c+1,mat) || findString(i,j-1,c+1,mat) || findString(i+1,j,c+1,mat) || findString(i-1,j,c+1,mat))
                return true;
            else
                mat[i][j] = s.charAt(c);
        }
        return false;
    }
	public static void main(String[] args) {
	   // Scanner input = new Scanner(System.in);
	   // System.out.println("Enter the String:");
	   // s = input.next();
	   // ss = s.length();
	   // System.out.println("Enter the size of the matrix:");
	   // n = input.nextInt();
	   // m = input.nextInt();
	   // System.out.println("Enter the characters of the matrix");
	   // char[][] mat = new char[n][m];
	   // for(int i=0;i<n;i++)
    // 	       for(int j=0;j<m;j++)
    // 	            mat[i][j] = input.next().charAt(0);
    	       
    	       
	   s = "CODING"; //"CODINGMART";
	   n = 5;
	   m = 4;
	   ss = s.length();
	   char[][] mat = {
	       {'A','B','C','O'},
	       {'S','F','C','D'},
	       {'A','D','E','I'},
	       {'A','M','G','N'},
	       {'R','X','M','A'}
	   };
	  
	  
	   Boolean ans = false;
	   for(int i=0;i<n;i++){
	       for(int j=0;j<m;j++){
	           if(mat[i][j]==s.charAt(0)){
	                ans = findString(i,j,0,mat);
	                }
	                if(ans){
	                    j=m;
	                    i=n;
	                }
	       }
	   }
	   if(ans){
	       System.out.println("Found");
    	   for(int i=0;i<n;i++){
    	       for(int j=0;j<m;j++)
    	        System.out.print(mat[i][j]+" ");
    	       System.out.println();
    	   }
	   }
	   else
	    System.out.println("Not Found");
	}
}
