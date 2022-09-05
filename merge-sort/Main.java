import java.util.Scanner;
public class Main
{
    static void divide(int a[], int l, int r)
    {
        if(l<r){
            int m = l+(r-l)/2;
            divide(a, l, m);
            divide(a, m+1, r);
            mergeSort(a,l,m,r);
        }
    }
    static void mergeSort(int[] a,int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int la[] = new int[n1];
        int ra[] = new int[n2];
        int i,j=0,k=l;
        for(i=0;i<n1;i++)
            la[i] = a[l+i];
        for(i=0;i<n2;i++)
            ra[i] = a[m+i+1];
        i=0;
        while(i<n1 && j<n2)
        {
            if(la[i] <= ra[j]){
                a[k] = la[i];
                i++;
            }
            else{
                a[k] = ra[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = la[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = ra[j];
            j++;
            k++;
        }
    }
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    System.out.println("Enter the size of the array:");
	    int n = in.nextInt();
	    int[] a = new int[n];
	    System.out.println("Enter the elements of the array:");
	    for(int i=0;i<n;i++)
	        a[i] = in.nextInt();
		divide(a,0,n-1);
		for(int i=0;i<n;i++)
		    System.out.print(a[i]+" ");
	}
}