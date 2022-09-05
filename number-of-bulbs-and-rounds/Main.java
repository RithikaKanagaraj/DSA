import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int m=((int)Math.floor(Math.sqrt(n)));
        for(int i=1;i<=m;i++){
            System.out.print((int)Math.pow(i,2)+" ");
        }
        System.out.println();
        System.out.println(m);
    }
}