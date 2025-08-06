package arrays;

public class Duplicate {
	public static void main(String[] args) {
        int a = 10, b = 20, c = 10, d = 30, e = 20;

        System.out.println("Unique elements:");
        if (a != b && a != c && a != d && a != e) System.out.println(a);
        if (b != a && b != c && b != d && b != e) System.out.println(b);
        if (c != a && c != b && c != d && c != e) System.out.println(c);
        if (d != a && d != b && d != c && d != e) System.out.println(d);
        if (e != a && e != b && e != c && e != d) System.out.println(e);
    }

}
