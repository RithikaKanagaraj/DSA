import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    f=1;
                }
            }
            if(f==0){
                break;
            }
        }
        
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
        
    }
}