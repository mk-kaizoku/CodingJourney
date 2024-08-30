import java.util.*;

public class finding_the_floor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int Q=sc.nextInt();
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<Q; i++){
            int q=sc.nextInt();
            int result=floorbsr(arr,0,n-1,q,ans);
            System.out.println(result);
        }
        sc.close();
        
    }
    public static int floorbsr(int[] arr,int low, int high, int q,int ans){
        if(low>high){
            return ans;
        }
        int mid =(low+high)/2;
        if(arr[mid]<=q){
            return floorbsr(arr,mid+1,high,q,arr[mid]);
        }
        return floorbsr(arr,low,mid-1,q,ans);
    }
}