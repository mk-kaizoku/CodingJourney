import java.io.*;
import java.util.*;

public class power_of_2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            // A number if power of 2 if the binary form of the number contains only one set bit
            // Si       x   bi      x-1     bi      x&x-1   bi
            // 1	8	1000	7	    0111	0	    0000
            // 2	6	0110	5	    0101	4	    0100
            // 3	16	10000	15	    01111	0	    00000
            long x=sc.nextLong();
            if((x&(x-1))!=0)
                System.out.println("False");
            else
                System.out.println("True");
        }
    }
}