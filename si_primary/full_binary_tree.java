import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int x){
        val=x;
        left=null;
        right=null;
    }
}
public class full_binary_tree {

    public static TreeNode insert(TreeNode root, int x ){
        if(root==null)  return new TreeNode(x);
        if(root.val>x){
            root.left=insert(root.left, x);
        }else if(root.val<x){
            root.right=insert(root.right,x);
        }
        return root;
    }
    public static boolean isFBT(TreeNode root){
        if(root==null)  return true;

        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left!=null && root.right!=null){
            // recursively check if left and right sub tree is fbt
            // use logical and to ensure both are fbt then only return true
            return isFBT(root.left) && isFBT(root.right);
        }
        // if none case met so its single child hence we return false
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            TreeNode root=null;
            for(int i=0; i<n; i++){
                int x=sc.nextInt();
                root=insert(root,x);
            }
            if(isFBT(root)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
        sc.close();
    }
}