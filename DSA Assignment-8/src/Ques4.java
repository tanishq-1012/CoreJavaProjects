class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Ques4 {
	public TreeNode str2tree(String s) {
        if (s.isEmpty()) {
            return null;
        }

        return buildTree(s, new int[1]);
    }

    private TreeNode buildTree(String s, int[] i) {
        int start = i[0];
        int end = start;
        while (end < s.length() && (Character.isDigit(s.charAt(end)) || s.charAt(end) == '-')) {
            end++;
        }

        int val = Integer.parseInt(s.substring(start, end));
        TreeNode root = new TreeNode(val);

        if (end < s.length() && s.charAt(end) == '(') {
            i[0] = end + 1; // Move index to the next character after '('
            root.left = buildTree(s, i);
        }

        if (end < s.length() && s.charAt(end) == '(') {
            i[0] = end + 1; // Move index to the next character after '('
            root.right = buildTree(s, i);
        }

        if (end < s.length() && s.charAt(end) == ')') {
            i[0] = end + 1; // Move index to the next character after ')'
        }

        return root;
    }
    // Utility function to print the inorder traversal of the tree (for testing)
    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
	public static void main(String[] args) {
		Ques4 solution = new Ques4();
        String s = "4(2(3)(1))(6(5))";
        TreeNode root = solution.str2tree(s);
        solution.inorder(root); // Output: 3 2 1 4 5 6
	}

}
