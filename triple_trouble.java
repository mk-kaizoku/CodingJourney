// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/triple-trouble?page=0&pageSize=50

import java.io.*;
import java.util.*;

public class triple_trouble{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(tripletrouble(arr,n));

        }
    }
    static boolean checkbit(int n, int k){
        if(((n>>k)&1)==1)
            return true;
        return false;
    }

    static int tripletrouble(int[] arr, int n){
        int ans=0;
        for(int i=0; i<31; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(checkbit(arr[j],i))
                    count++;
            }
            if(count%3==1)
                ans+=1<<i;
        }
        return ans;
    }
}