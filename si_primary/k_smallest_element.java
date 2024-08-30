import java.io.*;
import java.util.*;

public class k_smallest_element {
    public static void kthSmallestEle(int[] arr , int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int n=arr.length;

        for(int num: arr){
            pq.add(num);
        }
        int hmm=k-1;
        while(hmm>0){
            pq.remove();
            hmm--;
        }
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;  i<n; i++){
                arr[i]=sc.nextInt();
            }
            kthSmallestEle(arr,k);
        }
    }
}