import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		System.out.println("enter the element you want to search");
		int x=s.nextInt();
		for(int i=0;i<n;i++){
		    if(a[i]==x){
		        System.out.println("element in  position" : i );
		        return;
		        
		    }
		    if(a[i]!=x && i==n-1){
		        System.out.println("not found");
		    }
		}
		
	}
}