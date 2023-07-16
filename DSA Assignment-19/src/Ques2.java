import java.util.*;
public class Ques2 {
	private class TreeNode {
        int val;
        int count;
        int leftCount;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.count = 1;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] result = new Integer[n];
        TreeNode root = null;

        for (int i = n - 1; i >= 0; i--) {
            root = insert(root, nums[i], result, i, 0);
        }

        return Arrays.asList(result);
    }

    private TreeNode insert(TreeNode node, int num, Integer[] result, int index, int preSum) {
        if (node == null) {
            node = new TreeNode(num);
            result[index] = preSum;
        } else if (node.val == num) {
            node.count++;
            result[index] = preSum + node.leftCount;
        } else if (node.val > num) {
            node.leftCount++;
            node.left = insert(node.left, num, result, index, preSum);
        } else {
            node.right = insert(node.right, num, result, index, preSum + node.count + node.leftCount);
        }
        return node;
    }
	public static void main(String[] args) {
		Ques2 solution = new Ques2();

        // Example 1
        int[] nums1 = {5, 2, 6, 1};
        List<Integer> result1 = solution.countSmaller(nums1);
        System.out.println(result1); // Output: [2, 1, 1, 0]

        // Example 2
        int[] nums2 = {-1};
        List<Integer> result2 = solution.countSmaller(nums2);
        System.out.println(result2); // Output: [0]

        // Example 3
        int[] nums3 = {-1, -1};
        List<Integer> result3 = solution.countSmaller(nums3);
        System.out.println(result3); // Output: [0, 0]
	}

}
