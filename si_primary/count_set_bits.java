// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/count-set-bits?page=0&pageSize=50

import java.util.*;

public class count_set_bits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int count=0;
            long n=sc.nextLong();
            // Iterate through 0-63 bits and check bit 
            // if set increment count
            for(int i=0; i<64; i++){
                if(checkbit(n,i))
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
        
    }
    public static boolean checkbit(long n, int k){
        return (((n>>k)&1)==1);
    }
}