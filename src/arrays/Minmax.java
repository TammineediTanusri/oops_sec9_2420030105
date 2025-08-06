package arrays;

public class Minmax {
	public static void main(String[] args) {
        int a = 25, b = 10, c = 30;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }

}
