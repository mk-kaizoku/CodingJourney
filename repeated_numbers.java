// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/repeated-numbers?page=0&pageSize=50
import java.io.*;
import java.util.*;

public class repeated_numbers {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            //  Hashing
            // creating a count array which stores count of each array element indexed in count[]
            // arr =         1 2 3 5 5 6 8
            // temp =        0 1 1 1 0 2 1 0 1 
            // temp_index    0 1 2 3 4 5 6 7 8
            int[] count=new int[n];
            for(int i=0; i<count.length; i++){
                count[arr[i]]++;
            }
            int x=2;
            // Iterate through temp array if found whose count is >1 print the number then look for second number 
            //  after two repeated numbers are printed as required exit loop as x reaches 0
            for(int i=0; i<count.length; i++){
                if(count[i]>1 && x>0){
                        System.out.print(i+" ");
                        x--;
                }
            }
            System.out.println();
        }

    }
}