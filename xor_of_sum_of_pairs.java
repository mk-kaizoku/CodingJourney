// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/xor-of-sum-of-pairs?page=0&pageSize=50
import java.io.*;
import java.util.*;

public class xor_of_sum_of_pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int ans=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                ans^=(2*arr[i]);
            }
            System.out.println(ans);
            
        }
    }
}