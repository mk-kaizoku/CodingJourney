//https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/protective-villagers?page=0&pageSize=100
// Maximum of minimums type problem using binary search approach 
// you search for distances ranging from lowest(1) and highest(arr[n-1]-arr[0]) and check if the distance is valid 
// such that we can seperate the k villagers by that distance 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans = bsprotectvill(arr,n,c);
            System.out.println(ans);
        }
    }

    public static boolean isValid(int[] arr ,int n, int c, int mid){
        int pos=0;   // last fixed position;
        int count=1;

        for(int i=0; i<n; i++){
            if(arr[i]-arr[pos]>=mid){
                count++;
                pos=i;
                if(count==c){
                    return true;
                }
            }
        }
        return false;
    }
    public static int bsprotectvill(int[] arr,int n, int c){
        int lo=1;
        int hi=arr[n-1]-arr[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isValid(arr,n,c,mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
