import java.util.*;
class TreeNode{
    int val;
    TreeNode left, right;
    
    TreeNode(int x){
        val=x;
        left=null;
        right=null;
    }
}


public class tree_traversals {
    static TreeNode insert(TreeNode root,int val){
        if(root==null)   return new TreeNode(val);
        if(val<root.val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    static void preorder(TreeNode root, List<Integer> arr){
        if(root==null){
            return ;
        }
        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    static List<Integer> preOrder(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        preorder(root,arr);
        return arr;
    }

    static void inorder(TreeNode root, List<Integer> arr){
        if(root==null)  return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    static List<Integer> inOrder(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        return arr;
    }
    static void postorder(TreeNode root, List<Integer> arr){
        if(root==null)  return;
        postorder(root.left,arr);
        postorder(root.right,arr);
        arr.add(root.val);
    }
    static List<Integer> postOrder(TreeNode root){
        List<Integer> arr = new ArrayList<>();
        postorder(root,arr);
        return arr;
    }
    static void print(List<Integer> arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            TreeNode root = null;
            for(int i=0; i<n; i++){
                int val=sc.nextInt();
                root=insert(root,val);
            }

            // List<Integer> pre =preOrder(root);
            // List<Integer> ino=inOrder(root);
            // List<Integer> post =postOrder(root);
            print(postOrder(root));
            print(preOrder(root));
            print(inOrder(root));
            
        }
    }
}
    