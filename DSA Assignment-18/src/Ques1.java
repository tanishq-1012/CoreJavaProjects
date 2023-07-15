import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Ques1 {
	 public static int[][] mergeIntervals(int[][] intervals) {
	        if (intervals == null || intervals.length == 0) {
	            return new int[0][];
	        }

	        // Sort the intervals based on their start times
	        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

	        List<int[]> mergedIntervals = new ArrayList<>();
	        int[] currentInterval = intervals[0];

	        for (int i = 1; i < intervals.length; i++) {
	            if (intervals[i][0] <= currentInterval[1]) {
	                // Merge the overlapping intervals
	                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
	            } else {
	                // Add the non-overlapping interval to the result
	                mergedIntervals.add(currentInterval);
	                currentInterval = intervals[i];
	            }
	        }

	        // Add the last interval to the result
	        mergedIntervals.add(currentInterval);

	        return mergedIntervals.toArray(new int[0][]);
	    }
	public static void main(String[] args) {
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] merged = mergeIntervals(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
	}

}
