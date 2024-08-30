// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-pairs?page=0&pageSize=100
//  if arr[i]+arr[j]==k return true; else return false;
// using binary search we find the required number

import java.util.*;

public class sum_of_pairs {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int required=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(sumofpairs(arr,n,required))
                System.out.println("True");
            else
                System.out.println("False");

            sc.close();
        }
    }
    public static boolean sumofpairs(int[] arr, int n, int required){
        for(int i=0; i<n; i++){
            int b=required-arr[i];
            if(bsr(arr,i+1,n-1,b))
                return true;
        }
        return false;
    }

    public static boolean bsr(int[] arr, int low,int high, int k){
        if(low>high)
            return false;
        int mid=low+(high-low)/2;
        if(arr[mid]==k)
            return true;
        if(k<arr[mid])
            return bsr(arr,low,mid-1,k);
        return bsr(arr,mid+1,high,k);
    }
}