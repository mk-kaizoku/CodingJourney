// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/triplet-with-sum-k?page=0&pageSize=100

// sort arr
// two for loops to set arr[i],arr[j]
// use bs to find if there exists k-arr[i]-arr[j]
import java.util.*;

public class triplet_with_sum_k{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(tripletsum(arr,n,k)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            sc.close();
        }
    }
    public static boolean bs(int[] arr, int low, int high, int k){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k) return true;
            else if(arr[mid]>k) high=mid-1;
            else    low=mid+1;
        }
        return false;
    }
    public static boolean tripletsum(int[] arr, int n, int k){
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                int diff=k-arr[i]-arr[j];
                if(bs(arr,j+1,n-1,diff)){
                    return true;
                }
            }
        }
        return false;
    }
}