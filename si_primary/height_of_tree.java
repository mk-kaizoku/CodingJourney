import java.util.*;
public class height_of_tree {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x){
            val=x;
            left=null;
            right=null;
        }
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left= insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;

    }
    public static int height(TreeNode root){
        if(root==null)  return -1;
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            TreeNode root= null;
            for(int i=0; i<n; i++){
                int val=sc.nextInt();
                root=insert(root,val);
            }
            System.out.println(height(root));
        }
    }
}
