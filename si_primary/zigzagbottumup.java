import java.util.*;
class TreeNode{
    TreeNode left, right;
    int val;
    TreeNode (int x){
        left=null;
        right=null;
        val=x;
    }
}
public class zigzagbottumup {
    public static TreeNode insert(TreeNode root, int x){
        if(root==null)  return new TreeNode(x);

        if(root.val>x){
            root.left= insert(root.left, x);
        }
        else{
            root.right=insert(root.right,x);
        }
        return root;
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> row  = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode temp=q.poll();
                row.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null)    q.add(temp.right);
            }
            ans.add(row);
        }
        return ans;
    }
    public static void printZigZagBottumUp(TreeNode root){
        List<List<Integer>> ans  =levelOrder(root);
        // Collections.reverse(ans);
        for(int i=ans.size()-1; i>=0; i--){
            List<Integer> row= ans.get(i);
            if(i%2!=0){
                for(int j=0; j<row.size(); j++){
                    System.out.print(row.get(j)+" ");
                }
            }
            else{
                for(int j=row.size()-1; j>=0; j--){
                    System.out.print(row.get(j)+" ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            TreeNode root= null;
            int n=sc.nextInt();
            for(int i=0; i<n; i++){
                int x= sc.nextInt();
                root=insert(root, x);
            }
            printZigZagBottumUp(root);

        }
        
        sc.close();

    }
}