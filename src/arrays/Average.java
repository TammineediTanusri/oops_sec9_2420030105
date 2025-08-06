package arrays;

public class Average {
	 public static void main(String[] args) {
	        int[] marks = {80, 75, 90, 85, 70, 95};
	        int total = 0;

	        int i = 0;
	        while(i < marks.length) {
	            total += marks[i];
	            i++;
	        }

	        double average = total / 6.0;

	        System.out.println("Subject marks:");
	        i = 0;
	        while(i < marks.length) {
	            System.out.println(marks[i]);
	            i++;
	        }

	        System.out.println("Total: " + total);
	        System.out.println("Average: " + average);
	    }

}
