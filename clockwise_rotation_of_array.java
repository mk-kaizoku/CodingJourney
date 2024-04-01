// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/clockwise-rotation-of-array?page=0&pageSize=100
import java.io.*;
import java.util.*;

public class clockwise_rotation_of_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            k%=n;
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            clockrotate(arr,n,k);

        }
    }
    // reverse whole array
    // reverse 0 to k-1
    // reverse remaining k to n-1 elements
    public static void clockrotate(int[] arr, int n, int k){
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}