// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/tower-of-hanoi?page=0&pageSize=100
import java.util.*;

public class tower_of_hanoi {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int result=(int) Math.pow(2,n)-1;
            System.out.println(result);
            hanoitowerR(n,'A','C','B');

        }
        sc.close();
    }
    
    public static void hanoitowerR(int n,char src, char dest, char aux){
        if(n==1){
            System.out.println("Move 1 from "+src+" to "+dest);
            return;
        }else{
            hanoitowerR(n-1,src,aux,dest);
            System.out.println("Move "+n+" from "+src+" to "+dest);
            hanoitowerR(n-1,aux,dest,src);            
        }
    }
}