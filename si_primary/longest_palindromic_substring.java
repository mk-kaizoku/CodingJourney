// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/longest-palindromic-substring?page=0&pageSize=100

import java.util.*;

public class longest_palindromic_substring {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] ch=s.toCharArray();
            System.out.println(longpalindromestring(ch,n));
        
        }
        sc.close();
    }

    public static int longpalindromestring(char[] ch, int n){
        int ans=1;
        for(int i=0; i<n; i++){
            int p1=i;
            int p2=i;
            
            while(p1>=0 && p2<n && ch[p1]==ch[p2]){         //cabac odd length substring case ch[p1]=ch[p2]=b here
                p1--;
                p2++;
            }

            ans=Math.max(ans,p2-p1-1);
            int p3=i;
            int p4=i+1;
            while(p3>=0 && p4<n && ch[p3]==ch[p4]){         //cabbac even lenth substring case ch[p3]=b ch[p4]=b (next)
                p3--;
                p4++;
            }
            ans=Math.max(ans,p4-p3-1);
        }
        return ans;
        
    }
}