// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/collecting-water?page=0&pageSize=100

import java.util.*;

public class collecting_water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(collectwater(arr,n));
        }
        sc.close();
    }
    public static int collectwater(int[] arr, int n){
        int left=0;
        int right =n-1;
        int leftmax=0;
        int rightmax=0;
        int result=0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax)
                    leftmax=arr[left];
                else
                    result+=leftmax-arr[left];
                left++;
            }
            else{
                if(arr[right]>=rightmax)
                    rightmax=arr[right];
                else
                    result+=rightmax-arr[right];
                right--;
            }

        }
        return result;
    }
}