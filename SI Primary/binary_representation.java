// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/binary-representation?page=0&pageSize=50

import java.io.*;
import java.util.*;

public class binary_representation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=binaryform(n);
            System.out.println(s);
        }
    }
    public static String binaryform(int n){
        String s="";
        if(n==0){
            return "0";
        }
        // s=n%2+s and n=n/2
        while(n>0){
            s=n%2+s;
            n=n/2;
        }
        return s;
    }
}