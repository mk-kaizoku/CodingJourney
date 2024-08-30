import java.util.*;

public class subset_sum_v1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            if(checksubsetsum(arr,n,s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
    static boolean checkbit(int n, int k){
        if(((n>>k)&1)>0)
            return true;
        return false;

        
    }
    static boolean checksubsetsum(int[] arr,int n, int s){
        for(int i=0; i<(1<<n); i++){
            int sum=0;
            for(int j=0; j<n; j++){
                if(checkbit(i,j)){
                    sum+=arr[j];
                }
            }
            if(sum==s){
                return true;
            }
        }
        return false;
    }
}