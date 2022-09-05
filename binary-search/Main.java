import java.util.*;
public class Main
{
    static int binarySearch(int[] arr,int strt,int end,int find){
        if(end>=strt){
            int mid = strt+(end-strt)/2;
            if(arr[mid]==find){
                return mid;
            }
            if(find<arr[mid])
                return binarySearch(arr,strt,mid-1,find);
            else
                return binarySearch(arr,mid+1,end,find);
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int len = input.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the array:");
		for(int i=0;i<len;i++)
		    arr[i] = input.nextInt();
		System.out.println("Enter the search element:");
		int find = input.nextInt();
		Arrays.sort(arr);
		
		int res = binarySearch(arr,0,len-1,find);
		
		if(res > 0)
		    System.out.println("Element is present at position : "+ res);
		else
		    System.out.println("Element is not present");
	}
}
