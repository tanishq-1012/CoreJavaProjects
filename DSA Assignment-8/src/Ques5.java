import java.util.Arrays;

public class Ques5 {
	public int compress(char[] chars) {
        int n = chars.length;
        int readPtr = 0, writePtr = 0;

        while (readPtr < n) {
            char currentChar = chars[readPtr];
            int count = 0;

            while (readPtr < n && chars[readPtr] == currentChar) {
                readPtr++;
                count++;
            }

            chars[writePtr++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char ch : countStr.toCharArray()) {
                    chars[writePtr++] = ch;
                }
            }
        }

        return writePtr;
    }
	public static void main(String[] args) {
		Ques5 solution = new Ques5();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = solution.compress(chars);
        System.out.println("New Length: " + newLength); // Output: 6
        System.out.println("Compressed Array: " + Arrays.toString(Arrays.copyOf(chars, newLength)));
        // Output: Compressed Array: ['a', '2', 'b', '2', 'c', '3']
	}

}
