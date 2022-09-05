import java.util.*;
public class Main {
    
    static int lsb(int n)
    {
        return n&1;
    }
    
    static int msb(int n)
    {
       int res=1;
       while(n>0)
       {
           n=n>>1;
           res=res<<1;
       }
        
        return res>>1;
    }
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter num: ");
		int num=in.nextInt();
		System.out.println("LSB "+lsb(num));
		System.out.println("MSB "+msb(num));
	}
}