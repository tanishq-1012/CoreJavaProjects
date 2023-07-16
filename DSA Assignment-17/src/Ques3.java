import java.util.LinkedList;
import java.util.Queue;
public class Ques3 {
	 public static int countStudentsUnableToEat(int[] students, int[] sandwiches) {
	        Queue<Integer> studentQueue = new LinkedList<>();
	        Queue<Integer> sandwichQueue = new LinkedList<>();
	        int unableToEat = 0;

	        for (int student : students) {
	            studentQueue.offer(student);
	        }

	        for (int sandwich : sandwiches) {
	            sandwichQueue.offer(sandwich);
	        }

	        while (!studentQueue.isEmpty() && !sandwichQueue.isEmpty()) {
	            if (studentQueue.peek() == sandwichQueue.peek()) {
	                studentQueue.poll();
	                sandwichQueue.poll();
	                unableToEat = 0; // Reset the count since a student was able to eat
	            } else {
	                studentQueue.offer(studentQueue.poll());
	                unableToEat++;
	            }

	            // If all students in the queue have gone to the end and still cannot eat, break the loop
	            if (unableToEat == studentQueue.size()) {
	                break;
	            }
	        }

	        return studentQueue.size();
	    }

	public static void main(String[] args) {
		int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println(countStudentsUnableToEat(students1, sandwiches1)); // Output: 0

        // Test Example 2
        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudentsUnableToEat(students2, sandwiches2)); // Output: 3
	}

}
