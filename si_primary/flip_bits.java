// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/flip-bits?page=0&pageSize=50

import java.util.*;

public class flip_bits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            // using xor operation to check no of bits required to be shifted 
            // counting no of set bits and returning the count 
            // a=20 b=10  
            // 10100  01010  a^b=11110  
            int x=a^b;
            int count=0;
            while(x>0){
                if ((x&1)==1)
                    count++;
                x>>=1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}