import java.util.*;
public class Main
{
    static void f(List<String> a, List<String> t,List<String> res, char prev)
    {
        if(a.size() == 0)
            return;
        for(String s : a)
        {
            if(s.charAt(0) == prev)
            {
                t.add(s);
                List<String> tl = new ArrayList<>(a);
                tl.remove(s);
                f(tl, t, res, s.charAt(s.length()-1));
                if(t.size() > res.size())
                {
                    res.clear();
                    for(String str : t)
                        res.add(str);
                }
                t.remove(s);
            }
        }
    }
    static void chain(List<String> a, int n)
    {
        List<String> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<String> l = new ArrayList<String>(a);
            List<String> t = new ArrayList<>();
            String ts = a.get(i);
            t.add(ts);
            l.remove(ts);
            f(l, t, res, ts.charAt(ts.length()-1));
        }
        for(String s : res)
            System.out.print(s + " ");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size: ");
        int n = sc.nextInt();
		System.out.println("enter elements: ");
		List<String> a = new ArrayList<>(n);
		for(int i=0;i<n;i++){
		    String s=sc.next();
		    a.add(s);
		}
	   
		chain(a, n);
	}
}
