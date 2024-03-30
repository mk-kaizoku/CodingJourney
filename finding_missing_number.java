/*Finding Missing Number

Max Score: 50

Given an array of size N, it contains all the numbers from 1 to N+1 inclusive, except one number. 
You have to find the missing number.



Input Format

The first line of input contains T - the number of test cases. It is followed by 2T lines, the first line of each test case contains
 N - size of the array and the next line contains N integers - the elements of the array.


Output Format

For each test case, print the missing number, separated by a new line.


Constraints

1 <= T <= 500

1 <= N <= 10000

1 <= ar[i] <= N+1



Example

Input

3

8

1 2 7 9 5 6 3 8

7

3 5 8 1 4 7 2

10

8 11 10 2 7 4 3 5 1 6



Output

4

6

9

 */
import java.io.*;
import java.util.*;

public class finding_missing_number {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            // 1 2 3 4   6 7    arr[i];
            // 1 2 3 4 5 6 7    actual sequence
            // 0 0 0 0 5 0 0    xor of arr and seq
            //  A XOR 0 = A
            int n=sc.nextInt();
            int xor2=0;
            // XOR of array elements 
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                xor2^=arr[i];
            }
            //  Actual XOR from given range including missing number from 1 to N+1
            int xor1=0;
            for(int i=1; i<=n+1; i++){
                xor1^=i;
            }
            //  Print the missing number obtained from xor1^xor2
            System.out.println(xor1^xor2);
            
        }
    }
}