import java.util.*;
class Main{
    static int power(int n,int p){
    int res=1;
      while(p>0){
        int a=p&1;
        if(a==1){
            res=res*n;
        }
        n=n*n;
        p=p>>1;
    }
    return res;
}
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int pow=in.nextInt();
        System.out.println("power of given number :"+ power(num,pow));
        
    }
}