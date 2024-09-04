import java.util.*;

public class trailing_zeros {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long count = trailingzeros(n);
            System.out.println(count);
        }
        
        sc.close();

    }
    public static long trailingzeros(long n){
        long count=0;
        for(long i=5; n/i>0; i*=5){
            count+=n/i;
        }
        return count;
    }
}