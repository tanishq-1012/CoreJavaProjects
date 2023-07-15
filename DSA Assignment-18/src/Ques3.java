
public class Ques3 {
	public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Placeholder for the API provided
    private boolean isBadVersion(int version) {
        // Implementation not provided in the question
        // This method will be provided by the product manager or the system
        return false;
    }
	public static void main(String[] args) {
		 Ques3 solution = new Ques3();

	        int n1 = 5, bad1 = 4;
	        System.out.println("First bad version: " + solution.firstBadVersion(n1));

	        int n2 = 1, bad2 = 1;
	        System.out.println("First bad version: " + solution.firstBadVersion(n2));
	}

}
