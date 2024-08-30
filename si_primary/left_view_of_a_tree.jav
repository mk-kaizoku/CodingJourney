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
public class left_view_of_a_tree {
    public static TreeNode insert(TreeNode root, int x){
        if(root==null){
            return new TreeNode(x);
        }
        if(root.val<x){
            root.right=insert(root.right,x);
        }
        else if(root.val>x){
            root.left=insert(root.left,x);
        }
        return root;
    }

    public static List<Integer> leftView(TreeNode root){
        List<Integer> result= new ArrayList<>();

        leftRecursive(root,0, result);
        return result;
    }

    public static void leftRecursive(TreeNode root, int level, List<Integer> result){
        if(root==null)  return;

        if(result.size()==level){
            result.add(root.val); // dry run for better understand w/examples
        }
        leftRecursive(root.left,level+1, result);
        leftRecursive(root.right,level+1, result);
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
            List<Integer> ans= leftView(root);

            for(int i=0; i<ans.size(); i++){
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        }
        
        sc.close();

    }
}