// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/check-anagrams?page=0&pageSize=100






// Input                                   Output
// 4 (test cases)
// iamlordvoldemort tommarvoloriddle       True
// b h                                     False
// stop post                               True
// hi hey                                  False

import java.io.*;
import java.util.*;

public class check_anagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s1=sc.next();
            String s2=sc.next();
            if(checkanagram(s1,s2)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }

        }
    }
    public static boolean checkanagram(String s1, String s2){
        int[] cnt1= new int[26];
        int[] cnt2= new int[26];
        for(int i=0; i<s1.length(); i++){
            cnt1[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            cnt2[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<25; i++){
            if(cnt1[i]!=cnt2[i]){
                return false;
            }
        }
        return true;

    }
}