import java.util.*;
class Main{
    static int n;
    
    static int partition(int[] a, int start, int end)
    {
        int i=start;
        int j=end;
        int pivot=a[i];
       
        while(i<j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
            int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            
        }
        int s=a[start];
        a[start]=a[j];
        a[j]=s;
        
        return j;
    }
    
    static void quick(int a[], int start, int end)
    {
        if(start<end){
        int j = partition(a, start, end);
        quick(a,start,j-1);
        quick(a,j+1,end);
        }
    }
   // public 
    
    
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        quick(a,0,n-1);
        for(int i =0;i<n;i++)
            System.out.print(a[i]+ " ");
    }
}
