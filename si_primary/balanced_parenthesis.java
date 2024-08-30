import java.util.*;

public class balanced_parenthesis {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int test_case=1;
        while(t-->0){
            System.out.println("Test Case #"+test_case+":");
            int n=sc.nextInt();
            print(n);
            test_case++;

        }
        sc.close();
    }
    public static void helper_recursive(char[] arr, int n, int idx, int oc, int cc,List<String> ans){
        if(idx==2*n){
            ans.add(new String(arr));
            return;
        }
        if(oc<n){
            arr[idx]='{';
            helper_recursive(arr,n,idx+1,oc+1,cc,ans);
        }
        if(cc<oc){
            arr[idx]='}';
            helper_recursive(arr,n,idx+1,oc,cc+1,ans);
        }
    }
    public static void print(int n){
        char[] arr = new char[2*n];
        List<String> ans=new ArrayList<>();
        helper_recursive(arr,n,0,0,0,ans);
        for(String s: ans){
            System.out.println(s);

        }
    }

}