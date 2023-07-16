
public class Ques5 {
	public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(factor2, Math.min(factor3, factor5));
            uglyNumbers[i] = nextUgly;

            if (nextUgly == factor2) {
                index2++;
                factor2 = uglyNumbers[index2] * 2;
            }
            if (nextUgly == factor3) {
                index3++;
                factor3 = uglyNumbers[index3] * 3;
            }
            if (nextUgly == factor5) {
                index5++;
                factor5 = uglyNumbers[index5] * 5;
            }
        }

        return uglyNumbers[n - 1];
    }

	public static void main(String[] args) {
		Ques5 solution = new Ques5();

        // Example
        int n = 10;
        int nthUgly = solution.nthUglyNumber(n);
        System.out.println(nthUgly);
        // Output: 12
	}

}
