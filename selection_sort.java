// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/selection-sort?page=0&pageSize=100

import java.io.*;
import java.util.*;

public class selection_sort {
    public static void selection_sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int max=0;
            for(int j=1; j<n-i; j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            System.out.print(max+" ");
            int temp=arr[max];
            arr[max]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            selection_sort(arr,n);
        }
    }
}