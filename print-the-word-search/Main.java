import java.util.*;
class Main{
    static int n,m;
    static boolean findString(String s,int i,int j,int c,char[][] mat)
    {
        if(c==s.length())
        {
            return true;
        }
        if(i>=n || j>=m || i<0 || j<0)
            return false;
            
        if(s.charAt(c)!=mat[i][j])
            return false;
            
        mat[i][j]='#';
        
        boolean res = findString(s,i,j+1,c+1,mat) || findString(s,i,j-1,c+1,mat) || findString(s,i+1,j,c+1,mat) || findString(s,i-1,j,c+1,mat);
        mat[i][j] = s.charAt(c);
        
        return res;
    }
public static void main(String args[]){
    n=6;
    m=6;
    char[][] mat = {
	       {'C','O','D','T','F','X'},
	       {'G','R','I','R','G','K'},
	       {'K','A','N','E','G','T'},
	       {'F','N','G','E','X','P'},
	       {'P','E','M','A','R','T'},
	       {'K','G','L','C','K','P'}
	   };
	String s[]={"CODINGMART","ORANGE","TREE","TRACK","PEN","CAT","TREE"};
	Set<String> hs = new HashSet<String>();
    for(int k=0;k<s.length;k++)
    {
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<m;j++)
	       {
	           if(mat[i][j]==s[k].charAt(0))
	           {
	                boolean ans = findString(s[k],i,j,0,mat);
	                if(ans)
	                {
	                    hs.add(s[k]);
	                   // System.out.println(s[k] + " ");
	                    j=m;
	                    i=n;
	                }
	           }
	       }
	       }
	   }
	   System.out.println(hs.toString());
	}
}