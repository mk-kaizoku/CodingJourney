import java.util.*;


class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){
        val=x;
        left=right=null;
    }
}
public class depth_of_tree_nodes {
    static TreeNode insert(TreeNode root, int val){
        if(root==null)  return new TreeNode(val);
        if(val<root.val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    
    static void depths(TreeNode root, Map<Integer, Integer> map, int depth){
        if(root==null)  return;

        map.put(root.val,depth);
        depths(root.left,map,depth+1);
        depths(root.right,map,depth+1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner  sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            TreeNode root =null;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                int x= arr[i];
                root=insert(root,x);
            }
            // we created a hashmap to store depths respective to each node value given in order and return them accordingly 

            Map<Integer, Integer> resultmap=new HashMap<>();
            depths(root, resultmap, 0);

            for(int i=0; i<n; i++){
                System.out.print(resultmap.get(arr[i])+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}