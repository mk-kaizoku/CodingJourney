// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/power-game?page=0&pageSize=100

import java.io.*;
import java.util.*;

public class power_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b= new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int ans=powersum(a,b,n);
            System.out.println(ans);
        }
    }
    static int powersum(int[] a,int[] b, int n){
        int x =0;
        int y=0;
        int sum=0;
        while(x<n && y<n){
            if(a[x]>b[y]){
                sum++;
                y++;
            }
            x++;
        }
        
        return sum;
    }
    
}