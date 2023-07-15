
public class Ques1 {
	 public static int mySqrt(int x) {
	        if (x == 0 || x == 1) {
	            return x;
	        }
	        
	        int left = 0;
	        int right = x;
	        int sqrt = 0;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (mid <= x / mid) {
	                sqrt = mid;
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        
	        return sqrt;
	    }
	public static void main(String[] args) {
		System.out.println(mySqrt(4)); // Output: 2
        System.out.println(mySqrt(8)); // Output: 2
        System.out.println(mySqrt(9)); // Output: 3
	}

}
