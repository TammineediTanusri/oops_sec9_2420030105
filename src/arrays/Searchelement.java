package arrays;

public class Searchelement {
	public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int search = 30;
        boolean found = false;

        for (int element : arr) {
            if (element == search) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(search + " is found in the array.");
        else
            System.out.println(search + " is not found in the array.");
    }

}
