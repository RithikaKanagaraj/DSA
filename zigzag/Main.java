import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter string: ");
        String s=in.next();
        System.out.println("enter no of rows: ");
        int row=in.nextInt();
        if(row == 1) System.out.println(s);

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int len = 2 * row - 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j + i < n; j += len) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != row- 1 && j + len - i < n)
                    ret.append(s.charAt(j + len - i));
            }
        }
        System.out.print(ret.toString());
    }
    
}
