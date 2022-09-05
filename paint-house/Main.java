import java.util.*;
public class Main
{   public static int dp(int house,int[][] arr){
       int p[]=new int[3];
       int p0,p1,p2;
       for(int i=0;i<house;i++){
           p0=arr[i][0]+Math.min(p[1],p[2]);
           p1=arr[i][1]+Math.min(p[0],p[2]);
           p2=arr[i][2]+Math.min(p[0],p[1]);
           p[0]=p0;
           p[1]=p1;
           p[2]=p2;
       }
       int min=Math.min(p[0],p[1]);
       int min1=Math.min(min,p[2]);
       return min1;
    }
	public static void main(String[] args) {
	
		   Scanner s=new Scanner(System.in);
		   int house=s.nextInt();
		   int arr[][]=new int[house][house];
		   for(int i=0;i<house;i++){
		       for(int j=0;j<house;j++){
		           int data;
		           arr[i][j]=s.nextInt();
		          
		       }
		   }
		   int cost=dp(house,arr);
		   System.out.println("cost:"+cost);
		  
	
	}
}