import java.util.*;
import java.io.*;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x){
        left=null;
        right=null;
        val=x;
    }
}
class Pair{
    TreeNode node;
    int line;
    Pair(TreeNode _node , int _line){
        node=_node;
        line=_line;
    }
}
public class top_view_tree {

    public static TreeNode insert(TreeNode root, int x){
        if(root==null){
            return new TreeNode(x);
        }
        if(root.val>x){
            root.left=insert(root.left,x);
        }else if(root.val<x){
            root.right=insert(root.right,x);
        }
        return root;
    }

    public static void topView(TreeNode root){
        if(root==null){
            return;
        }

        Queue<Pair>  q = new LinkedList<>();
        q.add(new Pair(root, 0));

        Map<Integer, Integer> mpp = new TreeMap<>();

        while(!q.isEmpty()){
            Pair p= q.poll();
            TreeNode temp=p.node;
            int l = p.line;

            if(!mpp.containsKey(l)){
                mpp.put(l, temp.val);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left, l-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right, l+1));
            }
        }
        for(int i: mpp.values()){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        // Scanner sc = new Scanner(System.in);
        // int t=sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t=Integer.parseInt(br.readLine().trim());

        while(t-->0){
            // int n=sc.nextInt();
            int n=Integer.parseInt(br.readLine().trim());
            TreeNode root=null;
            String[] nodes= br.readLine().trim().split("\\s+");
            for(int i=0; i<n; i++){
                // int x=sc.nextInt();
                int x=Integer.parseInt(nodes[i]);
                root=insert(root,x);
            }
            topView(root);
            
        }
        System.out.print(sb.toString());
        
        // sc.close();

    }
}