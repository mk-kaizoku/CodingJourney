/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class array_to_bst {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1);
    }
    private TreeNode helper(int[] nums, int left, int right){
        if(left>right)
            return null;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);

        return root;
    }
    public void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }   

    public static void main(String[] args) {
        array_to_bst solution = new array_to_bst();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = solution.sortedArrayToBST(nums);
        solution.printTree(root);
    }
}