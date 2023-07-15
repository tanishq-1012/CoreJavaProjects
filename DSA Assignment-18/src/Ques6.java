import java.util.Arrays;
import java.util.Comparator;

public class Ques6 {
	public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int currentEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentEnd) {
                arrows++;
                currentEnd = points[i][1];
            }
        }

        return arrows;
    }
	public static void main(String[] args) {
		 Ques6 solution = new Ques6();

	        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
	        System.out.println(solution.findMinArrowShots(points1)); // Output: 2

	        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
	        System.out.println(solution.findMinArrowShots(points2)); // Output: 4

	        int[][] points3 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
	        System.out.println(solution.findMinArrowShots(points3)); // Output: 2
	}

}
