// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-subarrays?page=0&pageSize=100
import java.util.*;

public class sum_of_subarrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        // int[] temp=new int[n];
        arr[0]=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arr[i]+=arr[i-1];
        }
        int q=sc.nextInt();
        while(q-->0){
            int start=sc.nextInt(),end=sc.nextInt();
            if(start>0)
            {
                System.out.println(arr[end]-arr[start-1]);
            }
            else
                System.out.println(arr[end]);
        }
        sc.close();
    }
}